package ma.rsmi.cms_hospital.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Helper {
    public static void swhitchScene (Class controllerClass,String resource, String title, Node node) throws IOException {
        Parent root = FXMLLoader.load(controllerClass.getResource(resource));
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();
        node.getScene().getWindow().hide();
    }
}
