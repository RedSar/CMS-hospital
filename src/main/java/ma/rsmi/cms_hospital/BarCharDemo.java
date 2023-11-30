package ma.rsmi.cms_hospital;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import ma.rsmi.cms_hospital.dao.DoctorDAOImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BarCharDemo extends Application {

  @Override
  public void start(Stage stage) {
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
    BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
    barChart.setTitle("BarChart Example");



    // Convert ArrayList of HashMaps to BarChart data
    ObservableList<XYChart.Series<String, Number>> barChartData = FXCollections.observableArrayList();

    for (Map<String, Object> data : dataList) {
      XYChart.Series<String, Number> series = new XYChart.Series<>();
      series.setName((String) data.get("Category"));

      // Assuming the key is "Value" for the numeric value
      series.getData().add(new XYChart.Data<>(data.get("Category").toString(), (Number) data.get("Value")));
      barChartData.add(series);
    }

    barChart.setData(new DoctorDAOImpl().getDoctorsCharData());

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
