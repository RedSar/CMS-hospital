package ma.rsmi.cms_hospital.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Helper {


    public static void switchScene(Class controllerClass, String resource, String title, Node node)  {
        Parent root = null;
        try {
            root = FXMLLoader.load(controllerClass.getResource(resource));
            Stage stage = new Stage();
            stage.setMinWidth(340);
            stage.setMinHeight(580);
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
            node.getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String now(){
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");

        // Format the DateTime
        return currentDateTime.format(formatter);
    }

    public static LocalDateTime checkDateIfNull(Timestamp date) {
        return date!=null? date.toLocalDateTime(): null;
    }
}
