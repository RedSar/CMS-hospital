package ma.rsmi.cms_hospital.dao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ma.rsmi.cms_hospital.entity.User;
import ma.rsmi.cms_hospital.utils.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public class UserDAOImpl implements UserDAO{
  Connection connection = null;
  PreparedStatement pstm = null;
  ResultSet rs = null;

  public static void main(String[] args) {
    UserDAO dao = new UserDAOImpl();
    dao.save(new User(
            "maram@rsmi.ma",
            "maram14",
            "maram",
            "Maram Guerchal",
            "/images/maram.png",
            "Femelle"
            ,
            LocalDate.of(2014,03,24)
    ));
    System.out.println("Users " + dao.findAll());
  }



  @Override
  public User findById(int id) {
    connection = DBConnection.getConnection();
    User user = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM admin WHERE id=?");
      pstm.setInt(1, id);
      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println("❌ User not found with the given id: " + id);
        return null;
      }

      if (rs.next()) {
          user = new User(rs.getInt("id"),
              rs.getString("email"),
              rs.getString("username"),
              rs.getString("password"),
              rs.getString("full_name"),
              rs.getString("image"),
              rs.getString("gender"),
              rs.getDate("date").toLocalDate()
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
    return user;
  }

  @Override
  public User findByUsernameAndPassword(String username, String password) {
    connection = DBConnection.getConnection();
    User user = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM admin WHERE username=? AND password=?");
      pstm.setString(1, username);
      pstm.setString(2, password);
      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println("❌ User not found with the given username: " + username);
        return null;
      }

      if (rs.next()) {
        user = new User(rs.getInt("id"),
            rs.getString("email"),
            rs.getString("username"),
            rs.getString("password"),
            rs.getString("full_name"),
            rs.getString("image"),
            rs.getString("gender"),
            rs.getDate("date").toLocalDate()
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
    return user;
  }

  @Override
  public User findByUsername(String username) {
    connection = DBConnection.getConnection();
    User user = null;
    try {
      pstm = connection.prepareStatement("SELECT * FROM admin WHERE username=?");
      pstm.setString(1, username);

      rs = pstm.executeQuery();
      if (!rs.isBeforeFirst()) {
        System.out.println("❌ User not found with the given username: " + username);
        return null;
      }

      if (rs.next()) {
        user = new User(rs.getInt("id"),
                rs.getString("email"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("full_name"),
                rs.getString("image"),
                rs.getString("gender"),
                rs.getDate("date").toLocalDate()
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
    return user;
  }

  @Override
  public ObservableList<User> findAll() {
    ObservableList<User> users = FXCollections.observableArrayList();

    connection = DBConnection.getConnection();
    String query = "SELECT * FROM admin";
    try {
      pstm = connection.prepareStatement(query);
      rs = pstm.executeQuery();

      while (rs.next())
        users.add(new User(
            rs.getInt("id"),
            rs.getString("email"),
            rs.getString("username"),
            rs.getString("password"),
            rs.getString("full_name"),
            rs.getString("image"),
            rs.getString("gender"),
            rs.getDate("date").toLocalDate()
        ));
      System.out.println("✅ query succeeded: " + query);
    } catch (SQLException ex) {
      ex.printStackTrace();
      System.out.println("❌ query failed: " + query);
    } finally {
      try {
        if (connection != null) connection.close();
        if (pstm != null) pstm.close();
        if (rs != null) rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }


    }

    return users;
  }



  @Override
  public void deleteById(int id) {
    connection = DBConnection.getConnection();
    String query = "SELECT * FROM admin WHERE id=?";

    try {
      pstm = connection.prepareStatement(query);
      pstm.setInt(1, id);
      rs = pstm.executeQuery();
      System.out.println("✅ query succeeded: " + query);

      if (rs.isBeforeFirst()) {
        try {
          query = "DELETE FROM admin WHERE id=?";
          pstm = connection.prepareStatement(query);
          pstm.setInt(1, id);
          pstm.executeUpdate();
          System.out.println("✅ query succeeded: " + query);
        } catch (SQLException ex) {
          ex.printStackTrace();
          System.out.println("❌ query failed: " + query);
        }
      }else  {
        System.out.println("❌ No user were found with the given id: '" + id +"'");
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
      System.out.println("❌ query failed: " + query);
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
  public void save(User user) {
    connection = DBConnection.getConnection();
    String query = "INSERT INTO admin(email, username, password, full_name, image, gender, date) VALUES(?, ?, ?, ?, ?, ?, ? )";
    try {
      pstm = connection.prepareStatement(query);
      pstm.setString(1, user.getEmail());
      pstm.setString(2, user.getUsername());
      pstm.setString(3, user.getPassword());
      pstm.setString(4, user.getFullName());
      pstm.setString(5, user.getImage());
      pstm.setString(6, user.getGender());
      pstm.setDate(7, java.sql.Date.valueOf(user.getDate()));

      pstm.executeUpdate();
      System.out.println("✅ query succeeded: " + query);
    } catch (SQLException ex) {
      ex.printStackTrace();
      System.out.println("❌ query failed: " + query);
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
  public void update(User user) {
    String query = "SELECT * FROM user WHERE id=?";
    connection = DBConnection.getConnection();

    try {
      pstm = connection.prepareStatement(query);
      pstm.setInt(1, user.getId());
      rs = pstm.executeQuery();
      System.out.println("✅ query succeeded: " + query);

      if (rs.isBeforeFirst()) {
        while (rs.next()){
          User oldStudent = new User(
              rs.getInt("id"),
              rs.getString("email"),
              rs.getString("username"),
              rs.getString("password"),
              rs.getString("full_name"),
              rs.getString("image"),
              rs.getString("gender"),
              rs.getDate("date").toLocalDate()
          );
        }

        try {
          query = "UPDATE user SET email=?, username=?, password=?, full_name=?, image=?, gender=?, date=? WHERE id=?";
          pstm = connection.prepareStatement(query);
          pstm = connection.prepareStatement(query);
          pstm.setInt(8, user.getId());
          pstm.setString(1, user.getEmail());
          pstm.setString(2, user.getUsername());
          pstm.setString(3, user.getPassword());
          pstm.setString(4, user.getFullName());
          pstm.setString(5, user.getImage());
          pstm.setString(6, user.getGender());
          pstm.setDate(7, java.sql.Date.valueOf(user.getDate()));
          pstm.executeUpdate();
          System.out.println("✅ query succeeded: " + query);
        } catch (SQLException ex) {
          ex.printStackTrace();
          System.out.println("❌ query failed: " + query);
        }
      }else  {
        System.out.println("❌ No User were found with the given id: '" + user.getId() +"'");
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
      System.out.println("❌ query failed: " + query);
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
}
