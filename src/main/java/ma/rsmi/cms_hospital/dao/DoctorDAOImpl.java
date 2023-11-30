package ma.rsmi.cms_hospital.dao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;
import ma.rsmi.cms_hospital.entity.Doctor;
import ma.rsmi.cms_hospital.utils.DBConnection;
import ma.rsmi.cms_hospital.utils.Helper;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO{
  Connection connection = null;
  PreparedStatement pstm = null;
  ResultSet rs = null;

  public static void main(String[] args) {
    DoctorDAO dao = new DoctorDAOImpl();
    System.out.println("chart data: " + dao.getDoctorsCharData());
  }

  @Override
  public Doctor findById(int id) {
    connection = DBConnection.getConnection();
    Doctor doctor = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM doctors WHERE id=?");
      pstm.setInt(1, id);
      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println(Helper.now() + ": ❌ Doctor not found with the given id: " + id);
        return null;
      }

      if (rs.next()) {
          doctor = new Doctor(rs.getInt("id"),
              rs.getString("doctorId"),
              rs.getString("password"),
              rs.getString("full_name"),
              rs.getString("email"),
              rs.getString("status"),
              rs.getString("gender"),
              rs.getLong("mobile"),
              rs.getString("specialized"),
              rs.getString("address"),
              rs.getString("image"),
              rs.getTimestamp("date").toLocalDateTime(),
              Helper.checkDateIfNull(rs.getTimestamp("la    st_modify_date")),
              Helper.checkDateIfNull(rs.getTimestamp("last_delete_date"))
          );
        }



    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return doctor;
  }
 @Override
  public int getMaxId() {
    connection = DBConnection.getConnection();
    int maxId = 0;
    try {
      pstm = connection.prepareStatement("SELECT MAX(ID) as maxId FROM doctors");
      rs = pstm.executeQuery();
      if (rs.next()) {
       maxId = rs.getInt("maxId");
      }



    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return maxId;
  }
  @Override
  public Doctor findByDoctorIdAndPassword(String doctorId, String password) {
    connection = DBConnection.getConnection();
    Doctor doctor = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM doctors WHERE doctorId=? AND password=?");
      pstm.setString(1, doctorId);
      pstm.setString(2, password);
      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println(Helper.now() + ":❌Doctor not found with the given doctorId: " + doctorId);
        return null;
      }

      if (rs.next()) {
        doctor = new Doctor(rs.getInt("id"),
                rs.getString("doctorId"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getString("email"),
                rs.getString("status"),
                rs.getString("gender"),
                rs.getLong("mobile"),
                rs.getString("specialized"),
                rs.getString("address"),
                rs.getString("image"),
                rs.getTimestamp("date").toLocalDateTime(),
                Helper.checkDateIfNull(rs.getTimestamp("last_modify_date")),
                Helper.checkDateIfNull(rs.getTimestamp("last_delete_date"))
        );
      }



    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return doctor;
  }

  @Override
  public Doctor findByDoctorIdAndPasswordAndStatus(String doctorId, String password, String status) {
    connection = DBConnection.getConnection();
    Doctor doctor = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM doctors WHERE doctorId=? AND password=? AND status=?");
      pstm.setString(1, doctorId);
      pstm.setString(2, password);
      pstm.setString(3, status);
      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println(Helper.now() + ":❌Doctor not found with the given doctorId: " + doctorId);
        return null;
      }
      if (rs.next()) {

        doctor = new Doctor(rs.getInt("id"),
                rs.getString("doctorId"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getString("email"),
                rs.getString("status"),
                rs.getString("gender"),
                rs.getLong("mobile"),
                rs.getString("specialized"),
                rs.getString("address"),
                rs.getString("image"),
                rs.getTimestamp("date").toLocalDateTime(),
                Helper.checkDateIfNull(rs.getTimestamp("last_modify_date")),
                Helper.checkDateIfNull(rs.getTimestamp("last_delete_date"))
        );
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return doctor;
  }

  @Override
  public Doctor findByDoctorId(String doctorId) {
    connection = DBConnection.getConnection();
    Doctor doctor = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM doctors WHERE doctorId=?");
      pstm.setString(1, doctorId);

      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println(Helper.now() + ":❌ Doctor not found with the given doctorId: " + doctorId);
        return null;
      }

      if (rs.next()) {
        doctor =  new Doctor(rs.getInt("id"),
                rs.getString("doctorId"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getString("email"),
                rs.getString("status"),
                rs.getString("gender"),
                rs.getLong("mobile"),
                rs.getString("specialized"),
                rs.getString("address"),
                rs.getString("image"),
                rs.getTimestamp("date").toLocalDateTime(),
               Helper.checkDateIfNull( rs.getTimestamp("last_modify_date")),
               Helper.checkDateIfNull(rs.getTimestamp("last_delete_date"))
        );
      }



    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return doctor;
  }

  @Override
  public ObservableList<Doctor> findAll() {
    ObservableList<Doctor> doctors = FXCollections.observableArrayList();

    connection = DBConnection.getConnection();
    String query = "SELECT * FROM doctors";
    try {
      pstm = connection.prepareStatement(query);
      rs = pstm.executeQuery();

      while (rs.next())
        doctors.add(new Doctor(rs.getInt("id"),
                rs.getString("doctorId"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getString("email"),
                rs.getString("status"),
                rs.getString("gender"),
                rs.getLong("mobile"),
                rs.getString("specialized"),
                rs.getString("address"),
                rs.getString("image"),
                rs.getTimestamp("date").toLocalDateTime(),
            Helper.checkDateIfNull( rs.getTimestamp("last_modify_date")),
            Helper.checkDateIfNull(rs.getTimestamp("last_delete_date"))
        ));
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);
    } catch (SQLException ex) {
      ex.printStackTrace();
      System.out.println(Helper.now() + ":❌ query failed: " + query);
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }


    }

    return doctors;
  }

  @Override
  public void deleteById(int id) {
    connection = DBConnection.getConnection();
    String query = "SELECT * FROM doctors WHERE id=?";

    try {
      pstm = connection.prepareStatement(query);
      pstm.setInt(1, id);
      rs = pstm.executeQuery();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);

      if (rs.isBeforeFirst()) {
        try {
          query = "UPDATE doctors SET last_delete_date=? WHERE id=?";
          pstm = connection.prepareStatement(query);
          pstm.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
          pstm.setInt(2, id);
          pstm.executeUpdate();
          System.out.println(Helper.now() + ":✅ query succeeded: " + query);
        } catch (SQLException ex) {
          ex.printStackTrace();
          System.out.println(Helper.now() + ":❌ query failed: " + query);
        }
      }else  {
        System.out.println(Helper.now() + ":❌ No doctor were found with the given id: '" + id +"'");
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
      System.out.println(Helper.now() + ":❌ query failed: " + query);
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }

    }
  }

  @Override
  public void save(Doctor doctor) {
    connection = DBConnection.getConnection();
    String query = "INSERT INTO doctors(doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
    try {
      Long value = doctor.getMobile();
      long mobile = value==null? 0L : value;
      pstm = connection.prepareStatement(query);
      pstm.setString(1, doctor.getDoctorID());
      pstm.setString(2, doctor.getPassword());
      pstm.setString(3, doctor.getFullName());
      pstm.setString(4, doctor.getEmail());
      pstm.setString(5, doctor.getStatus());
      pstm.setString(6, doctor.getGender());
      pstm.setLong(7, mobile);
      pstm.setString(8, doctor.getSpecialized());
      pstm.setString(9, doctor.getAddress());
      pstm.setString(10, doctor.getImage());
      pstm.setTimestamp(11, Timestamp.valueOf(LocalDateTime.now()));
      pstm.setTimestamp(12, null);
      pstm.setTimestamp(13, null);


      pstm.executeUpdate();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);
    } catch (SQLException ex) {
      ex.printStackTrace();
      System.out.println(Helper.now() + ":❌ query failed: " + query);
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void update(Doctor doctor) {
    String query = "SELECT * FROM doctors WHERE id=?";
    connection = DBConnection.getConnection();

    try {
      pstm = connection.prepareStatement(query);
      pstm.setInt(1, doctor.getId());
      rs = pstm.executeQuery();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);
      Doctor oldDoctor = null;
      if (rs.isBeforeFirst()) {
        while (rs.next()){
          oldDoctor = new Doctor(
                  rs.getInt("id"),
                  rs.getString("doctorId"),
                  rs.getString("password"),
                  rs.getString("full_name"),
                  rs.getString("email"),
                  rs.getString("status"),
                  rs.getString("gender"),
                  rs.getLong("mobile"),
                  rs.getString("specialized"),
                  rs.getString("address"),
                  rs.getString("image"),
                  rs.getTimestamp("date").toLocalDateTime(),
                  rs.getTimestamp("last_modify_date").toLocalDateTime(),
                  rs.getTimestamp("last_delete_date").toLocalDateTime()
          );
        }
//email, doctorId, password, full_name, status, date
        try {
          //int id, String doctorID, String password, String fullName, String email, String status, String gender, Long mobile, String specialized, String address, String image, LocalDateTime date, LocalDateTime dateModify, LocalDateTime dateDelete
          query = "UPDATE doctors SET doctorID=?, password=?, full_name=?, email=?, status=?, gender=?,mobile=?,specialized=?,address=?,image=?,date=?,last_modify_date=?,last_delete_date=?  WHERE id=?";
          pstm = connection.prepareStatement(query);
          pstm = connection.prepareStatement(query);

          pstm.setInt(14, oldDoctor.getId());
          pstm.setString(1, doctor.getDoctorID());
          pstm.setString(2, doctor.getPassword());
          pstm.setString(3, doctor.getFullName());
          pstm.setString(4, doctor.getEmail());
          pstm.setString(5, doctor.getStatus());
          pstm.setString(6, doctor.getGender());
          pstm.setLong(7, doctor.getMobile());
          pstm.setString(8, doctor.getSpecialized());
          pstm.setString(9, doctor.getAddress());
          pstm.setString(10, doctor.getImage());
          pstm.setTimestamp(11, Timestamp.valueOf(doctor.getDate()));
          pstm.setTimestamp(12, Timestamp.valueOf(LocalDateTime.now()));
          pstm.setTimestamp(13, Timestamp.valueOf(doctor.getDateDelete()));
          pstm.executeUpdate();
          System.out.println(Helper.now() + ":✅ query succeeded: " + query);
        } catch (SQLException ex) {
          ex.printStackTrace();
          System.out.println(Helper.now() + ":❌ query failed: " + query);
        }
      }else  {
        System.out.println(Helper.now() + ":❌ No User were found with the given id: '" + doctor.getId() +"'");
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
      System.out.println(Helper.now() + ":❌ query failed: " + query);
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }

    }
  }

  @Override
  public int getActiveDoctors() {
    connection = DBConnection.getConnection();
    int activeDoctors = 0;
    try {
      String query = "SELECT COUNT(id) as activeDoctors FROM cms_hospital.doctors WHERE status='active' AND last_delete_date is NULL;";
      pstm = connection.prepareStatement(query);
      rs = pstm.executeQuery();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);
      if (rs.next()) {
        activeDoctors = rs.getInt("activeDoctors");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return activeDoctors;
  }

  @Override
  public ObservableList<XYChart.Series<String, Number>> getDoctorsCharData() {
    connection = DBConnection.getConnection();
    ObservableList<XYChart.Series<String, Number>> chartData = FXCollections.observableArrayList();

    try {
      String query = "SELECT specialized,COUNT(*) as total FROM cms_hospital.doctors WHERE last_delete_date is NULL GROUP BY specialized;";
      pstm = connection.prepareStatement(query);
      rs = pstm.executeQuery();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);
      while (rs.next()) {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        String specialized = rs.getString("specialized");
        Number total = rs.getInt("total");
        series.setName(specialized);
        series.getData().add(new XYChart.Data<>(specialized, total));
        chartData.add(series);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return chartData;

  }
}
