/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyktx;

//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author VuHoang
 */


    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
       

/**
 *
 * @author giasutinhoc.vn
 */
public class QuanLyKTX {
 public static void main(String[] args) {
     
     
     
     
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=DB_Student;user=sa;password=sa";

        try (Connection con = DriverManager.getConnection(connectionUrl); 
                Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM SinhVien";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("MaSV") + " " + rs.getString("HoTen")+ " " + rs.getString("Email")+ " " + rs.getString("SoDT")+ " " + rs.getString("DiaChi")+ " " + rs.getString("GioiTinh"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }

//  try {
//    String dbURL = "jdbc:sqlserver://localhost;databaseName=DB_Student;user=sa;password=sa";
//    Connection conn = DriverManager.getConnection(dbURL);
//    if (conn != null) {
//      System.out.println("Connected");
//      DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//      System.out.println("Driver name: " + dm.getDriverName());
//      System.out.println("Driver version: " + dm.getDriverVersion());
//      System.out.println("Product name: " + dm.getDatabaseProductName());
//      System.out.println("Product version: " + dm.getDatabaseProductVersion());
//    }
//   } catch (SQLException ex) {
//     System.err.println("Cannot connect database, " + ex);
//   }
  }
}
    
    

