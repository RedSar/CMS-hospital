package ma.rsmi.cms_hospital.dao;


import javafx.collections.ObservableList;
import ma.rsmi.cms_hospital.entity.User;

import java.util.List;

public interface UserDAO {

  public abstract User findById(int id);
  public abstract User findByUsernameUndPassword(String username, String password);
  public abstract User findByUsername(String username);
  public abstract ObservableList<User> findAll();
  public abstract void deleteById(int id);
  public abstract void save(User user);
  public abstract void update(User user);
}