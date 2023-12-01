package ma.rsmi.cms_hospital.entity;

import java.time.LocalDateTime;

public class Appointment {
  private Integer id;
  private Integer appointmentId;
  private Integer patientId;
  private String name;
  private String gender;
  private String description;
  private String diagnosis;
  private String treatment;
  private Long mobile;
  private String address;
  private LocalDateTime date;
  private LocalDateTime dateModify;
  private LocalDateTime dateDelete;
  private String status;
  private String doctorID;
  private String specialized;
  private LocalDateTime schedule;

  public Appointment(Integer id, Integer appointmentId, Integer patientId, String name, String gender, String description, String diagnosis, String treatment, Long mobile, String address, LocalDateTime date, LocalDateTime dateModify, LocalDateTime dateDelete, String status, String doctorID, String specialized, LocalDateTime schedule) {
    this.id = id;
    this.appointmentId = appointmentId;
    this.patientId = patientId;
    this.name = name;
    this.gender = gender;
    this.description = description;
    this.diagnosis = diagnosis;
    this.treatment = treatment;
    this.mobile = mobile;
    this.address = address;
    this.date = date;
    this.dateModify = dateModify;
    this.dateDelete = dateDelete;
    this.status = status;
    this.doctorID = doctorID;
    this.specialized = specialized;
    this.schedule = schedule;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getAppointmentId() {
    return appointmentId;
  }

  public void setAppointmentId(Integer appointmentId) {
    this.appointmentId = appointmentId;
  }

  public Integer getPatientId() {
    return patientId;
  }

  public void setPatientId(Integer patientId) {
    this.patientId = patientId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public String getTreatment() {
    return treatment;
  }

  public void setTreatment(String treatment) {
    this.treatment = treatment;
  }

  public Long getMobile() {
    return mobile;
  }

  public void setMobile(Long mobile) {
    this.mobile = mobile;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public LocalDateTime getDateModify() {
    return dateModify;
  }

  public void setDateModify(LocalDateTime dateModify) {
    this.dateModify = dateModify;
  }

  public LocalDateTime getDateDelete() {
    return dateDelete;
  }

  public void setDateDelete(LocalDateTime dateDelete) {
    this.dateDelete = dateDelete;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDoctorID() {
    return doctorID;
  }

  public void setDoctorID(String doctorID) {
    this.doctorID = doctorID;
  }

  public String getSpecialized() {
    return specialized;
  }

  public void setSpecialized(String specialized) {
    this.specialized = specialized;
  }

  public LocalDateTime getSchedule() {
    return schedule;
  }

  public void setSchedule(LocalDateTime schedule) {
    this.schedule = schedule;
  }

  @Override
  public String toString() {
    return "\n-> Appointment{" +
        "id=" + id +
        ", appointmentId=" + appointmentId +
        ", patientId=" + patientId +
        ", name='" + name + '\'' +
        ", gender='" + gender + '\'' +
        ", description='" + description + '\'' +
        ", diagnosis='" + diagnosis + '\'' +
        ", treatment='" + treatment + '\'' +
        ", mobile=" + mobile +
        ", address='" + address + '\'' +
        ", date=" + date +
        ", dateModify=" + dateModify +
        ", dateDelete=" + dateDelete +
        ", status='" + status + '\'' +
        ", doctorID='" + doctorID + '\'' +
        ", specialized='" + specialized + '\'' +
        ", schedule=" + schedule +
        '}';
  }
}
