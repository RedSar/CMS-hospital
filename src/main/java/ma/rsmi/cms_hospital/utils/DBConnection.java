package ma.rsmi.cms_hospital.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DBConnection {
    public static Connection getConnection(){
        ResourceBundle rb = ResourceBundle.getBundle("db");
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(
                    rb.getString("mysql.url"),
                    rb.getString("user"),
                    rb.getString("password"));
            System.out.println(Helper.now() + ": ✅Connection succeeded ...");

        } catch (SQLException e){
            System.out.println(Helper.now() + ": ❌ Connection Failed");
            e.printStackTrace();
        }
        return connection;
    }
    public static Connection getH2Connection(){
        Statement stm =null;
        Connection connection=null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:h2:~/cms_hospital",
                    "sa",
                    "");
            System.out.println(Helper.now() + ": ✅Connection succeeded ...");


        } catch (SQLException | ClassNotFoundException e){
            System.out.println(Helper.now() + ": ❌ Connection Failed");
            e.printStackTrace();
        }

        return connection;
    }
}
