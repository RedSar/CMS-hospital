package ma.rsmi.cms_hospital.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashboardController implements Initializable {
    public AnchorPane apMainDashboard;
    public AnchorPane apFooter;
    public Circle cPofilImageTop;
    public Label lblUsername;
    public Label lblDate;
    public Label lblDashboardName;
    public Button btnLogout;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onLogout(ActionEvent event) {
    }
}
