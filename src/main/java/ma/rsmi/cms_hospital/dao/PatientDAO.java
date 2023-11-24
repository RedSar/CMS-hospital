package ma.rsmi.cms_hospital.dao;


import javafx.collections.ObservableList;
import ma.rsmi.cms_hospital.entity.Patient;

public interface PatientDAO {

  public abstract Patient findById(int id);
  public abstract int getMaxId();
  public abstract Patient findByPatientIdAndPassword(String patientId, String password);
  public abstract Patient findByPatientIdAndPasswordAndStatus(String patientId, String password, String status);
  public abstract Patient findByPatientId(String PatientId);
  public abstract ObservableList<Patient> findAll();
  public abstract void deleteById(int id);
  public abstract void save(Patient patient);
  public abstract void update(Patient patient);
  public abstract int getActivePatients();
  public abstract int getTotalPatients();
}