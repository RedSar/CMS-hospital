package ma.rsmi.cms_hospital;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import ma.rsmi.cms_hospital.utils.Helper;


import java.io.IOException;
import java.util.Objects;

public class App extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    Parent root;
    Font.loadFont(getClass().getResourceAsStream("/fonts/Roboto/Roboto-Light.ttf"), 14);
    Font.loadFont(getClass().getResourceAsStream("/fonts/Abel/Abel-Regular.ttf"), 14);
    //root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/admin-portal.fxml")));
    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/admin-dashboard.fxml")));
    root.setStyle("-fx-font-family: 'Abel';");
    Scene scene = new Scene(root);
    stage.setTitle("CMS hospital | Point d'accés");
    stage.setScene(scene);

    stage.show();


  }

  public static void main(String[] args) {

    launch();
  }
}