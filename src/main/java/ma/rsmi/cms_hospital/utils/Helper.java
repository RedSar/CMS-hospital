package ma.rsmi.cms_hospital.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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
}
