import javafx.collections.ObservableList;
import ma.rsmi.cms_hospital.dao.DoctorDAO;
import ma.rsmi.cms_hospital.dao.DoctorDAOImpl;
import ma.rsmi.cms_hospital.entity.Doctor;
import ma.rsmi.cms_hospital.utils.DBConnection;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class DoctorDAOImplTest {
    Connection connection;
    DoctorDAO dao = new DoctorDAOImpl();

    @Test
    void setup() {
        Connection connection = DBConnection.getH2Connection();
        String createTable = "CREATE TABLE IF NOT EXISTS  doctors(\n" +
                "id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "doctorId VARCHAR(100) NOT NULL,\n" +
                "email VARCHAR(100) NOT NULL,\n" +
                "full_name VARCHAR(100) NOT NULL,\n" +
                "password VARCHAR(255) NOT NULL,\n" +
                "status VARCHAR(50) NOT NULL,\n" +
                "mobile BIGINT ,\n" +
                "specialized VARCHAR(100),\n" +
                "address VARCHAR(100),\n" +
                "image VARCHAR(100),\n" +
                "gender VARCHAR(50),\n" +
                "date DATETIME NOT NULL,\n" +
                "last_modify_date DATETIME,\n" +
                "last_delete_date DATETIME\n" +
                ");";

        Statement stm = null;

        try {
            stm= connection.createStatement();
            stm.executeUpdate(createTable);
        } catch (SQLException  e) {
            e.printStackTrace();
        } finally {
            try {
                stm.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    void  save_test() {
        Doctor doctor = new Doctor("karim99",
                "karim",
                "karim ahmadi",
                "karim@hospital.com",
                "Active",
                "male",
                2125677886654L,
                "Dematologue",
                null,
                null);
        dao.save(doctor);
    }
    @Test
    void findById_test() {
        Assertions.assertEquals(dao.findById(1).getDoctorID(),"karim99");
    }

    @Test
     void  findByDoctorIdAndPassword_test(){
        Assertions.assertNotNull(dao.findByDoctorIdAndPassword("karim99","karim"));
    }

    @Test
     void  findAll_test() {
        System.out.println();
        Assertions.assertNotEquals(0,dao.findAll().size());
    }

    @Test
     void  update_test(){


        Doctor doctor = new Doctor( 1,"karim99-updated",
                "karim-updated",
                "karim ahmadi-updated",
                "karim@hospital.com-updated",
                "Active-updated",
                "male-updated",
                2125677886654L,
                "Dermatologue-updated",
                "address-updated",
                "image-updated",
                LocalDateTime.of(2027,01,01,23,55,23),
                LocalDateTime.of(2028,02,06,03,55,23),
                LocalDateTime.of(2027,01,01,23,55,23)
              );


        dao.update(doctor);



    }
    @Test
    void  deleteById_test() {

        dao.deleteById(1);
        Assertions.assertNull(dao.findById(1));
    }
}
