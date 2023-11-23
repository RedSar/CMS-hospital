package ma.rsmi.cms_hospital.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import java.util.List;

public class AdminDashboardController {

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
    private BarChart<?, ?> bcDoctorsData;

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
    private TableColumn<?, ?> tcDoctorsAction;

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
    private TableView<?> tvDoctors;

    @FXML
    private TableView<?> tvDoctorsDashboard;

    @FXML
    private TableView<?> tvPatients;

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


}
