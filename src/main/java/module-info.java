module ma.rsmi.cms_hospital {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.naming;
  requires mysql.connector.j;
  requires java.persistence;
  requires org.hibernate.orm.core;
  requires java.sql;
    requires net.synedra.validatorfx;
  requires fontawesomefx;
  requires com.jfoenix;

  opens fxml to javafx.fxml;
  opens ma.rsmi.cms_hospital.controllers to javafx.fxml;

  exports ma.rsmi.cms_hospital;
  exports ma.rsmi.cms_hospital.controllers;
  exports ma.rsmi.cms_hospital.dao;
  exports ma.rsmi.cms_hospital.entity;
}