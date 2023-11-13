package ma.rsmi.cms_hospital.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import ma.rsmi.cms_hospital.dao.UserDAO;
import ma.rsmi.cms_hospital.dao.UserDAOImpl;
import ma.rsmi.cms_hospital.entity.User;
import ma.rsmi.cms_hospital.utils.AlertMessage;
import ma.rsmi.cms_hospital.utils.AppState;
import ma.rsmi.cms_hospital.utils.Helper;
import net.synedra.validatorfx.Validator;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;



public class AdminPortalController implements Initializable {

  private Validator loginValidator = new Validator();
  private Validator registerValidator = new Validator();
  private AlertMessage alert = new AlertMessage();
  private UserDAO dao = new UserDAOImpl();

//Controls
  public CheckBox cbxShowPasswordReg;
  @FXML
  private AnchorPane AP_login;

  @FXML
  private AnchorPane AP_register;
  @FXML
  private Button btnSignIn;
  @FXML
  private Button btnSignIn1;
  @FXML
  private CheckBox cbxShowPassword;
  @FXML
  private ComboBox<?> cmbUserType;
  @FXML
  private Hyperlink hlSignIn;
  @FXML
  private Hyperlink hlSignUp;
  @FXML
  private PasswordField pfPassword;
  @FXML
  private PasswordField pfPasswordRegister;
  @FXML
  private TextField tfEmailRegister;
  @FXML
  private TextField tfPassword;
  @FXML
  private TextField tfPasswordRegister;
  @FXML
  private TextField tfUsername;
  @FXML
  private TextField tfUsernameRegister;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    populateRoleComboBox();

  }

  private void populateRoleComboBox() {
    List<String> portals = List.of(AppState.portals);
    ObservableList items = FXCollections.observableList(portals);
    System.out.println(items);
    cmbUserType.setItems(items);
  }


  @FXML
  void onSignIn() {
    notBlanckCheck(tfUsername, loginValidator);
    notBlanckCheck(pfPassword, loginValidator);

    if (loginValidator.validate()){

      User user = dao.findByUsernameUndPassword(tfUsername.getText(), getPassword("login"));
      if (user == null){
        alert.error("Nom d'utilisateur et mot de passe incorrectes");
      }else{
        AppState.adminId = user.getId();
        AppState.adminUsername = user.getUsername();
        try {
          alert.info("Vous êtes connecté ");
          Helper.swhitchScene(
                  this.getClass(),
                  "/fxml/admin-main-form.fxml",
                  "CMS hospital | Portail administrateur",
                  btnSignIn);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private String getPassword(String form) {
    String password = null;
    if (form.equals("login")){
      if (pfPassword.isVisible()){
        password = pfPassword.getText();

      }else{
        password = tfPassword.getText();
      }
    }else if(form.equals("register")) {
      if (pfPasswordRegister.isVisible()){
        password = pfPasswordRegister.getText();

      }else{
        password = tfPasswordRegister.getText();
      }
    }
    return password;
  }

  @FXML
  public void onRegister() {
    notBlanckCheck(tfEmailRegister,registerValidator);
    notBlanckCheck(tfUsernameRegister, registerValidator );
    notBlanckCheck(pfPasswordRegister,registerValidator );


    if(registerValidator.validate()){
        User user = dao.findByUsername(tfUsernameRegister.getText());
        if (user != null) {
          alert.error("Ce nom d'utilsateur est déjà utilsé");
        }else {
          dao.save(new User(
                  tfEmailRegister.getText(),
                  tfUsernameRegister.getText(),
                  getPassword("register"),
                  LocalDate.now()
                  ));

          alert.info("Enregistrement réussi");

          switchForm();
        }
    }
  }

  private void clearRegisterForm() {
    tfEmailRegister.clear();
    tfPasswordRegister.clear();
    pfPasswordRegister.clear();
    tfUsernameRegister.clear();
  }

  @FXML
  void switchForm() {
    boolean registerIsVisible = AP_register.isVisible();
    clearRegisterForm();
    clearLoginForm();

    AP_login.setVisible(registerIsVisible);
    AP_register.setVisible(!registerIsVisible);
  }

  private void clearLoginForm() {
    tfUsername.clear();
    pfPassword.clear();
    tfPassword.clear();
  }

  @FXML
  void loginShowPassword(){
    if (cbxShowPassword.isSelected()){
      tfPassword.setText(pfPassword.getText());
      tfPassword.setVisible(true);
      pfPassword.setVisible(false);
    }else{
      pfPassword.setText(tfPassword.getText());
      pfPassword.setVisible(true);
      tfPassword.setVisible(false);
    }
  }
  @FXML
  void registerShowPassword(){
    if (cbxShowPasswordReg.isSelected()){
      tfPasswordRegister.setText(pfPasswordRegister.getText());
      tfPasswordRegister.setVisible(true);
      pfPasswordRegister.setVisible(false);
    }else{
      pfPasswordRegister.setText(tfPasswordRegister.getText());
      pfPasswordRegister.setVisible(true);
      tfPasswordRegister.setVisible(false);
    }
  }

  private void notBlanckCheck(TextField input, Validator validator) {
    validator.createCheck()
            .withMethod(c -> {
              String text = c.get("text");
              if(text==null || text.isEmpty()){
                c.error("Ce champ est obligatoire");
              }
            })
            .dependsOn("text",input.textProperty())
            .decorates(input);
  }


}
