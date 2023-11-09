package ma.rsmi.cms_hospital.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class signInController {

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
  private CheckBox cbxShowPassword1;

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

  @FXML
  void onSignIn(ActionEvent event) {

  }

  @FXML
  void switchForm(ActionEvent event) {
      if(event.getSource() == hlSignIn){
        AP_register.setVisible(false);
        AP_login.setVisible(true);
      }

    if(event.getSource() == hlSignUp){
      AP_register.setVisible(true);
      AP_login.setVisible(false);
    }
  }

}
