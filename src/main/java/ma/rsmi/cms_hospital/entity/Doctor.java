package ma.rsmi.cms_hospital.entity;

import java.time.LocalDateTime;

public class Doctor {
    private int id;
    private String doctorID;
    private String password;
    private String fullName;
    private String email;
    private String status;
    private String gender;
    private Long mobile;
    private String specialized;
    private String address;
    private String image;
    private LocalDateTime date;
    private LocalDateTime dateModify;
    private LocalDateTime dateDelete;


    public Doctor(int id, String doctorID, String password, String fullName, String email, String status, String gender, Long mobile, String specialized, String address, String image, LocalDateTime date, LocalDateTime dateModify, LocalDateTime dateDelete) {
        this.id = id;
        this.doctorID = doctorID;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.status = status;
        this.gender = gender;
        this.mobile = mobile;
        this.specialized = specialized;
        this.address = address;
        this.image = image;
        this.date = date;
        this.dateModify = dateModify;
        this.dateDelete = dateDelete;
    }

    public Doctor(String doctorID, String password, String fullName, String email, String status, String gender, Long mobile, String specialized, String address, String image) {
        this.doctorID = doctorID;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.status = status;
        this.gender = gender;
        this.mobile = mobile;
        this.specialized = specialized;
        this.address = address;
        this.image = image;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    @Override
    public String toString() {
        return "\nDoctor{" +
                "id=" + id +
                ", doctorID='" + doctorID + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile=" + mobile +
                ", specialized='" + specialized + '\'' +
                ", address='" + address + '\'' +
                ", image='" + image + '\'' +
                ", date=" + date +
                ", dateModify=" + dateModify +
                ", dateDelete=" + dateDelete +
                ", status='" + status + '\'' +
                '}';
    }

    public boolean equals(Doctor obj) {
        return (
                this.doctorID == obj.doctorID
                && this.id == obj.id
                && this.password == obj.password
                && this.fullName == obj.fullName
                && this.email == obj.email
                && this.mobile == obj.mobile
                && this.image == obj.image
                && this.specialized == obj.specialized
                && this.gender == obj.gender
                && this.address == obj.address
                && this.status == obj.status
                && this.date == obj.date
        );


    }
}
