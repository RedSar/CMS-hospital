package ma.rsmi.cms_hospital.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import ma.rsmi.cms_hospital.dao.UserDAO;
import ma.rsmi.cms_hospital.dao.UserDAOImpl;
import ma.rsmi.cms_hospital.entity.User;
import ma.rsmi.cms_hospital.utils.AlertMessage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminPortalController implements Initializable {

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

  private AlertMessage alert = new AlertMessage();
  private UserDAO dao = new UserDAOImpl();
  @FXML
  void onSignIn() {
    if(tfUsername.getText().isEmpty() || tfPassword.getText().isEmpty()){
      alert.error("Nom d'utilisateur et mot de passe incorrectes");
    }else {
        String password = null;
        if (pfPassword.isVisible()){
          password = pfPassword.getText();
        }else{
          password = tfPassword.getText();
        }
        User user = dao.findByUsernameUndPassword(tfUsername.getText(), password);
        if (user == null){
          alert.error("Nom d'utilisateur et mot de passe incorrectes");
        }else{
          alert.info("Vous êtes connecté ");
        }
    }
  }

  @FXML
  void switchForm() {
    boolean registerIsVisible = AP_register.isVisible();
    AP_login.setVisible(registerIsVisible);
    AP_register.setVisible(!registerIsVisible);
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

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    
  }
}
