package ma.rsmi.cms_hospital.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class AlertMessage {
  private Alert alert;

  public void error(String message){
    alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Message d'erreur");
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
  }
  public void info(String message){
    alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Message d'information");
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
  }
  public void warn(String message){
    alert = new Alert(Alert.AlertType.WARNING);
    alert.setTitle("Message d'avertissement");
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
  }
  public boolean confirmationMessage(String message) {

    alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Message de confirmation");
    alert.setHeaderText(null);
    alert.setContentText(message);
    Optional<ButtonType> option = alert.showAndWait();

    if (option.get().equals(ButtonType.OK)) {
      return true;
    } else {
      return false;
    }

  }

}
