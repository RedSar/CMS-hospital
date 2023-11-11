package ma.rsmi.cms_hospital.entity;

import java.time.LocalDate;
import javax.persistence.*;
@Entity
public class User {
  @Id
  private int id;
  private String email;
  private String username;
  private String password;
  private String fullName;
  private String image;
  private String gender;
  private LocalDate date;

  public User(int id, String email, String username, String password, String fullName, String image, String gender, LocalDate date) {
    this.id = id;
    this.email = email;
    this.username = username;
    this.password = password;
    this.fullName = fullName;
    this.image = image;
    this.gender = gender;
    this.date = date;
  }

  public User(String email, String username, String password, String fullName, String image, String gender, LocalDate date) {
    this.email = email;
    this.username = username;
    this.password = password;
    this.fullName = fullName;
    this.image = image;
    this.gender = gender;
    this.date = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
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

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "\nUser{" +
        "id=" + id +
        ", email='" + email + '\'' +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", fullName='" + fullName + '\'' +
        ", image='" + image + '\'' +
        ", gender='" + gender + '\'' +
        ", date=" + date +
        '}';
  }
}
