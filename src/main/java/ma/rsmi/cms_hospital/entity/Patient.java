package ma.rsmi.cms_hospital.entity;

import java.time.LocalDateTime;

public class Patient {
    private Integer id;
    private String patientID;
    private String password;
    private String fullName;
    private Long mobile;
    private String address;
    private String image;
    private String description;
    private String diagnosis;
    private String treatment;
    private int doctorId;
    private String specialized;
    private String gender;
    private LocalDateTime date;
    private LocalDateTime dateModify;
    private LocalDateTime dateDelete;
    private String status;

    public Patient(Integer id, String patientID, String password, String fullName, Long mobile, String address, String image, String description, String diagnosis, String treatment, int doctorId, String specialized, String gender, LocalDateTime date, LocalDateTime dateModify, LocalDateTime dateDelete, String status) {
        this.id = id;
        this.patientID = patientID;
        this.password = password;
        this.fullName = fullName;
        this.mobile = mobile;
        this.address = address;
        this.image = image;
        this.description = description;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.doctorId = doctorId;
        this.specialized = specialized;
        this.gender = gender;
        this.date = date;
        this.dateModify = dateModify;
        this.dateDelete = dateDelete;
        this.status = status;
    }

    public Patient(String patientID, String password, String fullName, Long mobile, String address, String image, String description, String diagnosis, String treatment, int doctorId, String specialized, String gender, LocalDateTime date, LocalDateTime dateModify, LocalDateTime dateDelete, String status) {
        this.patientID = patientID;
        this.password = password;
        this.fullName = fullName;
        this.mobile = mobile;
        this.address = address;
        this.image = image;
        this.description = description;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.doctorId = doctorId;
        this.specialized = specialized;
        this.gender = gender;
        this.date = date;
        this.dateModify = dateModify;
        this.dateDelete = dateDelete;
        this.status = status;
    }

    public Patient(String patientID, String password, String fullName,int doctorId ,String status) {
        this.patientID = patientID;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
        this.doctorId = doctorId;
    }

    public Patient(String patientID, String password, String fullName, String status) {
        this.patientID = patientID;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getSpecialized() {
        return specialized;
    }

    public String getGender() {
        return gender;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public LocalDateTime getDateModify() {
        return dateModify;
    }

    public LocalDateTime getDateDelete() {
        return dateDelete;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setDateModify(LocalDateTime dateModify) {
        this.dateModify = dateModify;
    }

    public void setDateDelete(LocalDateTime dateDelete) {
        this.dateDelete = dateDelete;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nPatient{" +
                "id=" + id +
                ", patientID='" + patientID + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", doctorId=" + doctorId +
                ", specialized='" + specialized + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", dateModify=" + dateModify +
                ", dateDelete=" + dateDelete +
                ", status='" + status + '\'' +
                '}';
    }
}
