package ma.rsmi.cms_hospital;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import ma.rsmi.cms_hospital.dao.DoctorDAOImpl;
import ma.rsmi.cms_hospital.dao.PatientDAOImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BarCharDemo extends Application {

  @Override
  public void start(Stage stage) {
    // Create X and Y axes
    CategoryAxis xAxis = new CategoryAxis();
    NumberAxis yAxis = new NumberAxis();

    // Create the line chart with the axes
    LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);
    lineChart.setTitle("Monthly Line Chart");

    // Create a series and add it to the line chart
    XYChart.Series<String, Number> series = new XYChart.Series<>();
    lineChart.getData().add(series);

    // Add data points separately to the series
    series.getData().add(new XYChart.Data<>("January", 10));
    series.getData().add(new XYChart.Data<>("February", 15));
    series.getData().add(new XYChart.Data<>("March", 8));
    series.getData().add(new XYChart.Data<>("April", 20));
    series.getData().add(new XYChart.Data<>("May", 12));
    series.getData().add(new XYChart.Data<>("June", 18));

    // Create a scene and set it on the stage
    Scene scene = new Scene(lineChart, 800, 600);
    stage.setScene(scene);

    // Set the title of the stage
    stage.setTitle("Monthly Line Chart Example");

    // Show the stage
    stage.show();
  }
  public void start1(Stage stage) {
    // Sample data: ArrayList of HashMaps
    List<Map<String, Object>> dataList = new ArrayList<>();
    Map<String, Object> data1 = new HashMap<>();
    data1.put("Category", "A");
    data1.put("Value", 20);

    Map<String, Object> data2 = new HashMap<>();
    data2.put("Category", "B");
    data2.put("Value", 30);

    Map<String, Object> data3 = new HashMap<>();
    data3.put("Category", "C");
    data3.put("Value", 25);

    dataList.add(data1);
    dataList.add(data2);
    dataList.add(data3);

    // Create a BarChart
    CategoryAxis xAxis = new CategoryAxis();
    NumberAxis yAxis = new NumberAxis();
    LineChart<String, Number> barChart = new LineChart<>(xAxis, yAxis);
    barChart.setTitle("BarChart Example");



    // Convert ArrayList of HashMaps to BarChart data
    ObservableList<XYChart.Series<String, Number>> barChartData = FXCollections.observableArrayList();

    for (Map<String, Object> data : new PatientDAOImpl().getPatientsChartData().reversed()) {
      XYChart.Series<String, Number> series = new XYChart.Series<>();
      series.setName((String) data.get("month"));

      // Assuming the key is "Value" for the numeric value
      series.getData().add(new XYChart.Data<>(data.get("month").toString(), (Number) data.get("total")));
      barChartData.add(series);
    }

    barChart.setData(barChartData);

    // Create and show the scene
    Scene scene = new Scene(barChart, 600, 400);
    stage.setScene(scene);
    stage.setTitle("JavaFX BarChart Example");
    stage.show();
  }



  public static void main(String[] args) {
    launch(args);
  }
}
