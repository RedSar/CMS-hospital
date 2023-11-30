package ma.rsmi.cms_hospital.controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import ma.rsmi.cms_hospital.dao.*;
import ma.rsmi.cms_hospital.entity.Doctor;
import ma.rsmi.cms_hospital.entity.Patient;
import ma.rsmi.cms_hospital.utils.AlertMessage;
import ma.rsmi.cms_hospital.utils.AppState;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

public class AdminDashboardController implements Initializable {
     private  final AlertMessage alert = new AlertMessage();
     private final  DoctorDAO doctorDAO = new DoctorDAOImpl();
     private final UserDAO adminDAO = new UserDAOImpl();
     private final PatientDAO patientDAO = new PatientDAOImpl();
    private final ObservableList<Doctor> doctorsList = doctorDAO.findAll();

    @FXML
    private AreaChart<?, ?> acPatientsData;

    @FXML
    private AnchorPane apAdminDashboard;

    @FXML
    private AnchorPane apAppointments;

    @FXML
    private AnchorPane apDoctors;

    @FXML
    private AnchorPane apHeader;

    @FXML
    private AnchorPane apLeft;

    @FXML
    private AnchorPane apMainDashboard;

    @FXML
    private AnchorPane apPatients;

    @FXML
    private AnchorPane apPayment;

    @FXML
    private AnchorPane apProfile;

    @FXML
    private BarChart<String,Number> bcDoctorsData;

    @FXML
    private Button btnAppointments;

    @FXML
    private Button btnCheckout;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnDoctors;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnPatients;

    @FXML
    private Button btnPayment;

    @FXML
    private Button btnProfile;

    @FXML
    private Button btnProfileImport;

    @FXML
    private Button btnProfileUpdate;

    @FXML
    private Circle cPayment;

    @FXML
    private Circle cProfile;

    @FXML
    private Circle cProfileImageTop;

    @FXML
    private Label lblActiveDoctors;

    @FXML
    private Label lblActivePatients;

    @FXML
    private Label lblAdminId;

    @FXML
    private Label lblDashboardName;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblPaymentDate;

    @FXML
    private Label lblPaymentDoctor;

    @FXML
    private Label lblPaymentName;

    @FXML
    private Label lblPaymentPatientId;

    @FXML
    private Label lblProfileAdminId;

    @FXML
    private Label lblProfileDateCreated;

    @FXML
    private Label lblProfileEmail;

    @FXML
    private Label lblProfileName;

    @FXML
    private Label lblTotalAppointments;

    @FXML
    private Label lblTotalPatient;

    @FXML
    private Label lblUsername;

    @FXML
    private Label lblUsernameSidebar;

    @FXML
    private TableColumn<?, ?> tcAppointmentsAction;

    @FXML
    private TableColumn<?, ?> tcAppointmentsAppointmentID;

    @FXML
    private TableColumn<?, ?> tcAppointmentsContactNumber;

    @FXML
    private TableColumn<?, ?> tcAppointmentsDate;

    @FXML
    private TableColumn<?, ?> tcAppointmentsDateDelete;

    @FXML
    private TableColumn<?, ?> tcAppointmentsDateModify;

    @FXML
    private TableColumn<?, ?> tcAppointmentsDescription;

    @FXML
    private TableColumn<?, ?> tcAppointmentsGender;

    @FXML
    private TableColumn<?, ?> tcAppointmentsName;

    @FXML
    private TableColumn<?, ?> tcAppointmentsStatus;

    @FXML
    private TableColumn<?, ?> tcDoctorID;

    @FXML
    private TableColumn<Doctor, Void> tcDoctorsAction;

    @FXML
    private TableColumn<?, ?> tcDoctorsAddress;

    @FXML
    private TableColumn<?, ?> tcDoctorsContactNumber;

    @FXML
    private TableColumn<?, ?> tcDoctorsDoctorID;

    @FXML
    private TableColumn<?, ?> tcDoctorsEmail;

    @FXML
    private TableColumn<?, ?> tcDoctorsGender;

    @FXML
    private TableColumn<?, ?> tcDoctorsName;

    @FXML
    private TableColumn<?, ?> tcDoctorsSpecialization;

    @FXML
    private TableColumn<?, ?> tcDoctorsStatus;

    @FXML
    private TableColumn<?, ?> tcName;

    @FXML
    private TableColumn<?, ?> tcPatientsAction;

    @FXML
    private TableColumn<?, ?> tcPatientsContactNumber;

    @FXML
    private TableColumn<?, ?> tcPatientsDate;

    @FXML
    private TableColumn<?, ?> tcPatientsDateDelete;

    @FXML
    private TableColumn<?, ?> tcPatientsDateModify;

    @FXML
    private TableColumn<?, ?> tcPatientsDescription;

    @FXML
    private TableColumn<?, ?> tcPatientsGender;

    @FXML
    private TableColumn<?, ?> tcPatientsName;

    @FXML
    private TableColumn<?, ?> tcPatientsPatientID;

    @FXML
    private TableColumn<?, ?> tcPatientsStatus;

    @FXML
    private TableColumn<?, ?> tcPaymentDate;

    @FXML
    private TableColumn<?, ?> tcPaymentDiagnosis;

    @FXML
    private TableColumn<?, ?> tcPaymentDoctor;

    @FXML
    private TableColumn<?, ?> tcPaymentGender;

    @FXML
    private TableColumn<?, ?> tcPaymentName;

    @FXML
    private TableColumn<?, ?> tcPaymentPatientID;

    @FXML
    private TableColumn<?, ?> tcSpecialized;

    @FXML
    private TableColumn<?, ?> tcStatus;

    @FXML
    private TextField tfProfileAdminID;

    @FXML
    private TextField tfProfileEmail;

    @FXML
    private ComboBox<?> tfProfileStatus;

    @FXML
    private TextField tfProfileUsername;

    @FXML
    private TableView<?> tvAppointments;

    @FXML
    private TableView<Doctor> tvDoctors;

    @FXML
    private TableView<Doctor> tvDoctorsDashboard;

    @FXML
    private TableView<Patient> tvPatients;

    @FXML
    private TableView<?> tvPayment;

    @FXML
    void onLogout(ActionEvent event) {

    }

    @FXML
    void paymentCheckOut(ActionEvent event) {

    }

    @FXML
    void paymentSelectItems(MouseEvent event) {

    }

    @FXML
    void profileInsertImage(ActionEvent event) {

    }

    @FXML
    void profileUpdateBtn(ActionEvent event) {

    }

    @FXML
    void switchForm(ActionEvent event) {
        Button button = (Button) event.getSource();
        switch (button.getText()) {
            case "Dashboard" :
                apAdminDashboard.setVisible(true);
                setOthersInvisible(List.of(apDoctors,apPatients,apAppointments,apPayment,apProfile));
                break;
            case "Médecins" :
                apDoctors.setVisible(true);
                setOthersInvisible(List.of(apAdminDashboard,apPatients,apAppointments,apPayment,apProfile));
                break;
            case "Patients" :
                apPatients.setVisible(true);
                setOthersInvisible(List.of(apDoctors,apAdminDashboard,apAppointments,apPayment,apProfile));
                break;
            case "Rendez-vous" :
                apAppointments.setVisible(true);
                setOthersInvisible(List.of(apDoctors,apPatients,apAdminDashboard,apPayment,apProfile));
                break;
            case "Paiment" :
                apPayment.setVisible(true);
                setOthersInvisible(List.of(apDoctors,apPatients,apAdminDashboard,apAppointments,apProfile));
                break;
            case "Réglages de profil" :
                apProfile.setVisible(true);
                setOthersInvisible(List.of(apDoctors,apPatients,apAppointments,apPayment,apAdminDashboard));
                break;
        }
    }

    private void setOthersInvisible(List<AnchorPane> anchors) {
        for (AnchorPane anchor: anchors) {
            anchor.setVisible(false);
        }

    }

    private void fetchStatistics() {
        lblActiveDoctors.setText(doctorDAO.getActiveDoctors() + "");
        lblActivePatients.setText(patientDAO.getActivePatients() + "");
        lblTotalPatient.setText(patientDAO.getTotalPatients() + "");
    }

    private void displayDoctorsDataAdminDashboard(){
        tvDoctorsDashboard.setItems(doctorsList);
        tcDoctorID.setCellValueFactory(new PropertyValueFactory<>("doctorID"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        tcSpecialized.setCellValueFactory(new PropertyValueFactory<>("specialized"));
        tcStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

    }
    private void displayDoctorsTable(){
        tvDoctors.setItems(doctorsList);
        tcDoctorsDoctorID.setCellValueFactory(new PropertyValueFactory<>("doctorID"));
        tcDoctorsName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        tcDoctorsGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        tcDoctorsContactNumber.setCellValueFactory(new PropertyValueFactory<>("mobile"));
        tcDoctorsEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tcDoctorsSpecialization.setCellValueFactory(new PropertyValueFactory<>("specialized"));
        tcDoctorsAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tcDoctorsStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        tcDoctorsAction.setCellFactory(param -> {
          return new TableCell<>() {
            final Button btnEdit = createButton("EDIT", "Editer", "edit");
            final Button btnDelete = createButton("TRASH", "Supprimer", "delete");


            {
              btnEdit.setOnAction(event -> {
                Doctor doctor = getTableView().getItems().get(getIndex());
                System.out.println("Editer le médecin avec id: " + doctor.getId());
              });
              btnDelete.setOnAction(event -> {
                Doctor doctor = getTableView().getItems().get(getIndex());
                if (!alert.confirmationMessage("Vous êtes sûr de supprimer les données du médecin:\n- Id :  "+doctor.getDoctorID()+"\n- Nom : "+doctor.getFullName()))
                    return;
                System.out.println("Supprimer le médecin avec id: " + doctor.getId());
                doctorDAO.deleteById(doctor.getId());

                getTableView().getItems().remove(doctor);

              });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
              super.updateItem(item, empty);
              if (empty) {
                setGraphic(null);
              } else {
                setGraphic(createHBox(btnEdit, btnDelete));
              }
            }

            private HBox createHBox(Button... buttons) {
              HBox box = new HBox(buttons);
              box.setSpacing(10);
              box.setAlignment(Pos.CENTER);
              return box;
            }

            private Button createButton(String iconName, String message, String className){
                Button button = new Button();
                FontAwesomeIcon icon = new FontAwesomeIcon();
                icon.setGlyphName(iconName);
                Tooltip tooltip = new Tooltip(message);
                button.setTooltip(tooltip);
                button.getStyleClass().add(className);
                button.setGraphic(icon);
                button.setPrefWidth(30.0);
                return button;
            }


          };
        });
    }

    private void displayDoctorsChart(){
        bcDoctorsData.getData().clear();
        bcDoctorsData.setData(doctorDAO.getDoctorsCharData());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fetchStatistics();
        setAdminData();
        displayDoctorsDataAdminDashboard();
        displayDoctorsTable();
        displayDoctorsChart();
    }

    private void setAdminData() {
        lblUsername.setText(AppState.adminUsername);
        lblAdminId.setText(AppState.adminId + "");
        lblUsernameSidebar.setText(AppState.adminUsername);
    }
}
