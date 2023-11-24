package ma.rsmi.cms_hospital.dao;


import javafx.collections.ObservableList;
import ma.rsmi.cms_hospital.entity.Doctor;

public interface DoctorDAO {

  public abstract Doctor findById(int id);
  public abstract int getMaxId();
  public abstract Doctor findByDoctorIdAndPassword(String doctorId, String password);
  public abstract Doctor findByDoctorIdAndPasswordAndStatus(String doctorId, String password, String status);
  public abstract Doctor findByDoctorId(String doctorId);
  public abstract ObservableList<Doctor> findAll();
  public abstract void deleteById(int id);
  public abstract void save(Doctor doctor);
  public abstract void update(Doctor doctor);
  public abstract int getActiveDoctors();
}