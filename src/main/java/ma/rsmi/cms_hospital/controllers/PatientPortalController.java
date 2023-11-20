package ma.rsmi.cms_hospital.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import ma.rsmi.cms_hospital.dao.DoctorDAO;
import ma.rsmi.cms_hospital.dao.DoctorDAOImpl;
import ma.rsmi.cms_hospital.dao.PatientDAO;
import ma.rsmi.cms_hospital.dao.PatientDAOImpl;
import ma.rsmi.cms_hospital.entity.Doctor;
import ma.rsmi.cms_hospital.entity.Patient;
import ma.rsmi.cms_hospital.utils.AlertMessage;
import ma.rsmi.cms_hospital.utils.AppState;
import ma.rsmi.cms_hospital.utils.Helper;
import net.synedra.validatorfx.Validator;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class PatientPortalController implements Initializable {



    private final Validator loginValidator = new Validator();
    private final Validator registerValidator = new Validator();
    private final AlertMessage alert = new AlertMessage();
    private final PatientDAO dao = new PatientDAOImpl();

    //Controls
    public CheckBox cbxShowPasswordReg;
    @FXML
    private AnchorPane AP_login;

    @FXML
    private AnchorPane AP_register;
    @FXML
    private Button btnSignIn;

    @FXML
    private CheckBox cbxShowPassword;
    @FXML
    private ComboBox<String> cmbUserType;
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
    private TextField tfPatientId;
    @FXML
    private TextField tfPatientIdRegister;
    @FXML
    private TextField tfFullName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        populateRoleComboBox();
        setPatientId();

    }

    private void setPatientId() {
        int maxId = dao.getMaxId();
        int pid = maxId + 1;
        tfPatientIdRegister.setPromptText("CMSH-PID-" + pid);
        tfPatientIdRegister.setText("CMSH-PID-" + pid);
        tfPatientIdRegister.setDisable(true);
    }

    private void populateRoleComboBox() {

        List<String> portals = new ArrayList<>(Arrays.asList(AppState.portals));

        ObservableList<String> items = FXCollections.observableList(portals);
        cmbUserType.setItems(items);
    }


    @FXML
    void onSignIn() {
        notBlankCheck(tfPatientId, loginValidator);
        notBlankCheck(pfPassword, loginValidator);

        if (loginValidator.validate()) {

            Patient patient = dao.findByPatientIdAndPassword(tfPatientId.getText(), getPassword("login"));
            if (patient == null) {
                alert.error("Identité  et mot de passe incorrectes");
            } else if (patient.getStatus().equals("confirm")) {
                System.out.println("Vous avez besoin de l'approbation de l'administration!");
                alert.warn("Vous avez besoin de l'approbation de l'administration!");
            }else{
                AppState.patientId = patient.getId();

                alert.info("Patient connecté au système");
            }
        }
    }

    private String getPassword(String form) {
        String password = null;
        if (form.equals("login")) {
            if (pfPassword.isVisible()) {
                password = pfPassword.getText();

            } else {
                password = tfPassword.getText();
            }
        } else if (form.equals("register")) {
            if (pfPasswordRegister.isVisible()) {
                password = pfPasswordRegister.getText();

            } else {
                password = tfPasswordRegister.getText();
            }
        }
        return password;
    }

    @FXML
    public void onRegister() {
        notBlankCheck(tfFullName, registerValidator);
        notBlankCheck(tfEmailRegister, registerValidator);
        notBlankCheck(pfPasswordRegister, registerValidator);
        System.out.println("tfPatientIdRegister ->" + tfPatientIdRegister.getText());

        if (registerValidator.validate()) {
            Patient patient = dao.findByPatientId(tfPatientIdRegister.getText());
            if (patient != null) {
                alert.error("Ce Id est déjà ustilsé");
            } else {
                dao.save(new Patient(
                        tfPatientIdRegister.getText(),
                        getPassword("register"),
                        tfFullName.getText(),
                        "confirm"
                ));

                alert.info("Enregistrement réussi");

                switchForm();
            }
        }
    }

    private void clearRegisterForm() {
        tfFullName.clear();
        tfEmailRegister.clear();
        tfPasswordRegister.clear();
        pfPasswordRegister.clear();

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
        tfPatientId.clear();
        pfPassword.clear();
        tfPassword.clear();
    }

    @FXML
    void loginShowPassword() {
        if (cbxShowPassword.isSelected()) {
            tfPassword.setText(pfPassword.getText());
            tfPassword.setVisible(true);
            pfPassword.setVisible(false);
        } else {
            pfPassword.setText(tfPassword.getText());
            pfPassword.setVisible(true);
            tfPassword.setVisible(false);
        }
    }

    @FXML
    void registerShowPassword() {
        if (cbxShowPasswordReg.isSelected()) {
            tfPasswordRegister.setText(pfPasswordRegister.getText());
            tfPasswordRegister.setVisible(true);
            pfPasswordRegister.setVisible(false);
        } else {
            pfPasswordRegister.setText(tfPasswordRegister.getText());
            pfPasswordRegister.setVisible(true);
            tfPasswordRegister.setVisible(false);
        }
    }

    private void notBlankCheck(TextField input, Validator validator) {
        validator.createCheck()
                .withMethod(c -> {
                    String text = c.get("text");
                    if (text == null || text.isEmpty()) {
                        c.error("Ce champ est obligatoire");
                    }
                })
                .dependsOn("text", input.textProperty())
                .decorates(input);
    }
    @FXML
    private void switchPage() {

        switch(cmbUserType.getSelectionModel().getSelectedItem()){

            case "Administrateur":
                Helper.switchScene(this.getClass(), "/fxml/admin-portal.fxml", "CMS hospital | Portail administrateur", btnSignIn);break;
            case "Médecin":
                Helper.switchScene(this.getClass(), "/fxml/doctor-portal.fxml", "CMS hospital | Portail Médecin", btnSignIn);break;
            //case "Patient":
               // Helper.switchScene(this.getClass(), "/fxml/admin-portal.fxml", "CMS hospital | Portail Patient", btnSignIn);break;

        }


    }
}
