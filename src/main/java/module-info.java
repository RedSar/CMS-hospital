module ma.rsmi.cms_hospital {
  requires javafx.controls;
  requires javafx.fxml;


  opens fxml to javafx.fxml;
  opens ma.rsmi.cms_hospital.controllers to javafx.fxml;

  exports ma.rsmi.cms_hospital;
  exports ma.rsmi.cms_hospital.controllers;
}