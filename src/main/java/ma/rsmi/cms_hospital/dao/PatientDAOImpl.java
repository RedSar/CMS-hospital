package ma.rsmi.cms_hospital.dao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ma.rsmi.cms_hospital.entity.Patient;
import ma.rsmi.cms_hospital.utils.DBConnection;
import ma.rsmi.cms_hospital.utils.Helper;

import java.sql.*;
import java.time.LocalDateTime;

public class PatientDAOImpl implements PatientDAO{
  Connection connection = null;
  PreparedStatement pstm = null;
  ResultSet rs = null;

  public static void main(String[] args) {
    PatientDAO dao = new PatientDAOImpl();
    System.out.println("Active Patients: " + dao.getActivePatients());
    System.out.println("Total Patients: " + dao.getTotalPatients());


  }



  @Override
  public Patient findById(int id) {
    connection = DBConnection.getConnection();
    Patient patient = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM patients WHERE id=?");
      pstm.setInt(1, id);
      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println(Helper.now() + ": ❌ Patient not found with the given id: " + id);
        return null;
      }
      if (rs.next()) {
          patient = new Patient(rs.getInt("id"),
              rs.getString("patientId"),
              rs.getString("password"),
              rs.getString("full_name"),
              rs.getLong("mobile"),
              rs.getString("address"),
              rs.getString("image"),
              rs.getString("description"),
              rs.getString("diagnosis"),
              rs.getString("treatment"),
              rs.getInt("doctor_id"),
              rs.getString("specialized"),
              rs.getString("gender"),
              rs.getTimestamp("date").toLocalDateTime(),
              Helper.checkDateIfNull(rs.getTimestamp("last_modify_date")),
              Helper.checkDateIfNull(rs.getTimestamp("last_delete_date")),
              rs.getString("status")

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
    return patient;
  }
 @Override
  public int getMaxId() {
    connection = DBConnection.getConnection();
    int maxId = 0;
    try {
      pstm = connection.prepareStatement("SELECT MAX(ID) as maxId FROM patients");
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
  public Patient findByPatientIdAndPassword(String patientId, String password) {
    connection = DBConnection.getConnection();
    Patient patient = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM patients WHERE patientId=? AND password=?");
      pstm.setString(1, patientId);
      pstm.setString(2, password);
      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println(Helper.now() + ":❌Patient not found with the given patientId: " + patientId);
        return null;
      }

      if (rs.next()) {
        patient = new Patient(rs.getInt("id"),
                rs.getString("patientId"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getLong("mobile"),
                rs.getString("address"),
                rs.getString("image"),
                rs.getString("description"),
                rs.getString("diagnosis"),
                rs.getString("treatment"),
                rs.getInt("doctor_id"),
                rs.getString("specialized"),
                rs.getString("gender"),
                rs.getTimestamp("date").toLocalDateTime(),
                Helper.checkDateIfNull(rs.getTimestamp("last_modify_date")),
                Helper.checkDateIfNull(rs.getTimestamp("last_delete_date")),
                rs.getString("status")

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
    return patient;
  }

  @Override
  public Patient findByPatientIdAndPasswordAndStatus(String patientId, String password, String status) {
    connection = DBConnection.getConnection();
    Patient patient = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM patients WHERE patientId=? AND password=? AND status=?");
      pstm.setString(1, patientId);
      pstm.setString(2, password);
      pstm.setString(3, status);
      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println(Helper.now() + ":❌Patient not found with the given patientId: " + patientId);
        return null;
      }
      if (rs.next()) {
       ;
        Timestamp deleteDateValue = rs.getTimestamp("last_modify_date");
        LocalDateTime dateDelete = deleteDateValue!=null ? deleteDateValue.toLocalDateTime() : null;
        patient = new Patient(rs.getInt("id"),
                rs.getString("patientId"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getLong("mobile"),
                rs.getString("address"),
                rs.getString("image"),
                rs.getString("description"),
                rs.getString("diagnosis"),
                rs.getString("treatment"),
                rs.getInt("doctor_id"),
                rs.getString("specialized"),
                rs.getString("gender"),
                rs.getTimestamp("date").toLocalDateTime(),
                Helper.checkDateIfNull(rs.getTimestamp("last_modify_date")),
                Helper.checkDateIfNull(rs.getTimestamp("last_delete_date")),
                rs.getString("status")

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
    return patient;
  }

  @Override
  public Patient findByPatientId(String patientId) {
    connection = DBConnection.getConnection();
    Patient patient = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM patients WHERE patientId=?");
      pstm.setString(1, patientId);

      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println(Helper.now() + ":❌ Patient not found with the given patientId: " + patientId);
        return null;
      }

      if (rs.next()) {
        patient = new Patient(rs.getInt("id"),
                rs.getString("patientId"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getLong("mobile"),
                rs.getString("address"),
                rs.getString("image"),
                rs.getString("description"),
                rs.getString("diagnosis"),
                rs.getString("treatment"),
                rs.getInt("doctor_id"),
                rs.getString("specialized"),
                rs.getString("gender"),
                rs.getTimestamp("date").toLocalDateTime(),
                Helper.checkDateIfNull(rs.getTimestamp("last_modify_date")),
                Helper.checkDateIfNull(rs.getTimestamp("last_delete_date")),
                rs.getString("status"));
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
    return patient;
  }

  @Override
  public ObservableList<Patient> findAll() {
    ObservableList<Patient> patients = FXCollections.observableArrayList();

    connection = DBConnection.getConnection();
    String query = "SELECT * FROM patients";
    try {
      pstm = connection.prepareStatement(query);
      rs = pstm.executeQuery();

      while (rs.next())
        patients.add(new Patient(rs.getInt("id"),
                rs.getString("patientId"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getLong("mobile"),
                rs.getString("address"),
                rs.getString("image"),
                rs.getString("description"),
                rs.getString("diagnosis"),
                rs.getString("treatment"),
                rs.getInt("doctor_id"),
                rs.getString("specialized"),
                rs.getString("gender"),
                rs.getTimestamp("date").toLocalDateTime(),
                Helper.checkDateIfNull(rs.getTimestamp("last_modify_date")),
                Helper.checkDateIfNull(rs.getTimestamp("last_delete_date")),
                rs.getString("status"))
        );
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

    return patients;
  }



  @Override
  public void deleteById(int id) {
    connection = DBConnection.getConnection();
    String query = "SELECT * FROM patients WHERE id=?";

    try {
      pstm = connection.prepareStatement(query);
      pstm.setInt(1, id);
      rs = pstm.executeQuery();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);

      if (rs.isBeforeFirst()) {
        try {
          query = "DELETE FROM patients WHERE id=?";
          pstm = connection.prepareStatement(query);
          pstm.setInt(1, id);
          pstm.executeUpdate();
          System.out.println(Helper.now() + ":✅ query succeeded: " + query);
        } catch (SQLException ex) {
          ex.printStackTrace();
          System.out.println(Helper.now() + ":❌ query failed: " + query);
        }
      }else  {
        System.out.println(Helper.now() + ":❌ No patient were found with the given id: '" + id +"'");
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
  public void save(Patient patient) {
    connection = DBConnection.getConnection();
    String query = "INSERT INTO patients(patientId, password, full_name, mobile, address, image, description, diagnosis, treatment, doctor_id, date, last_modify_date, last_delete_date, status) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
    try {
      Long value = patient.getMobile();
      long mobile = value==null? 0L : value;
      pstm = connection.prepareStatement(query);
      pstm.setString(1, patient.getPatientID());
      pstm.setString(2, patient.getPassword());
      pstm.setString(3, patient.getFullName());
      pstm.setLong(4, mobile);
      pstm.setString(5, patient.getAddress());
      pstm.setString(6, patient.getImage());
      pstm.setString(7, patient.getDescription());
      pstm.setString(8, patient.getDiagnosis());
      pstm.setString(9, patient.getTreatment());
      pstm.setInt(10, patient.getDoctorId());
      pstm.setTimestamp(11, Timestamp.valueOf(LocalDateTime.now()));
      pstm.setTimestamp(12, null);
      pstm.setTimestamp(13, null);
      pstm.setString(14, "confirm");

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
  public void update(Patient patient) {
    String query = "SELECT * FROM patients WHERE id=?";
    connection = DBConnection.getConnection();

    try {
      pstm = connection.prepareStatement(query);
      pstm.setInt(1, patient.getId());
      rs = pstm.executeQuery();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);
      Patient oldPatient = null;
      if (rs.isBeforeFirst()) {
        while (rs.next()){
          oldPatient = new Patient(rs.getInt("id"),
                  rs.getString("patientId"),
                  rs.getString("password"),
                  rs.getString("full_name"),
                  rs.getLong("mobile"),
                  rs.getString("address"),
                  rs.getString("image"),
                  rs.getString("description"),
                  rs.getString("diagnosis"),
                  rs.getString("treatment"),
                  rs.getInt("doctor_id"),
                  rs.getString("specialized"),
                  rs.getString("gender"),
                  rs.getTimestamp("date").toLocalDateTime(),
                  Helper.checkDateIfNull(rs.getTimestamp("last_modify_date")),
                  Helper.checkDateIfNull(rs.getTimestamp("last_delete_date")),
                  rs.getString("status"));
        }

        try {
          query = "UPDATE patients SET patientID=?, password=?, full_name=?, mobile=?, address=?, image=?, description=?, diagnosis=?, treatment=?, doctor_id=?, date=?, last_modify_date=?, last_delete_date=?, status=?  WHERE id=?";
          Long value = patient.getMobile();
          long mobile = value==null? 0L : value;
          pstm = connection.prepareStatement(query);

          pstm.setInt(15, oldPatient.getId());
          pstm.setString(1, patient.getPatientID());
          pstm.setString(2, patient.getPassword());
          pstm.setString(3, patient.getFullName());
          pstm.setLong(4, mobile);
          pstm.setString(5, patient.getAddress());
          pstm.setString(6, patient.getImage());
          pstm.setString(7, patient.getDescription());
          pstm.setString(8, patient.getDiagnosis());
          pstm.setString(9, patient.getTreatment());
          pstm.setInt(10, patient.getDoctorId());
          pstm.setTimestamp(11, Timestamp.valueOf(patient.getDate()));
          pstm.setTimestamp(12, Timestamp.valueOf(LocalDateTime.now()));
          pstm.setTimestamp(13, patient.getDiagnosis()!= null ? Timestamp.valueOf(patient.getDiagnosis()) : null);
          pstm.setString(14, patient.getStatus());
          pstm.executeUpdate();
          System.out.println(Helper.now() + ":✅ query succeeded: " + query);
        } catch (SQLException ex) {
          ex.printStackTrace();
          System.out.println(Helper.now() + ":❌ query failed: " + query);
        }
      }else  {
        System.out.println(Helper.now() + ":❌ No User were found with the given id: '" + patient.getId() +"'");
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
  public int getActivePatients() {

    connection = DBConnection.getConnection();
    int activePatients = 0;
    try {
      String query = "SELECT COUNT(id) as activePatients FROM patients WHERE status='active' AND last_delete_date is NULL;";
      pstm = connection.prepareStatement(query);
      rs = pstm.executeQuery();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);
      if (rs.next()) {
        activePatients = rs.getInt("activePatients");
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
    return activePatients;
  }

  @Override
  public int getTotalPatients() {
    connection = DBConnection.getConnection();
    int totalPatients = 0;
    try {
      String query = "SELECT COUNT(id) as totalPatients FROM patients WHERE last_delete_date is NULL;";
      pstm = connection.prepareStatement(query);
      rs = pstm.executeQuery();
      System.out.println(Helper.now() + ":✅ query succeeded: " + query);
      if (rs.next()) {
        totalPatients = rs.getInt("totalPatients");
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
    return totalPatients;
  }
}
