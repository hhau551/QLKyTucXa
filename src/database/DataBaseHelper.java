/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author VuHoang
 */
public class  DataBaseHelper {
   public static final String connectionUrl = "jdbc:sqlserver://localhost;"
            + "databaseName=DB_Student;user=sa;password=sa";
   public static Connection getDBConnect(){
       Connection conn = null;
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       }catch(Exception e){
           System.out.println("chua co driver"+e.toString());
       }
       try{
           conn = DriverManager.getConnection(connectionUrl);
           return conn;
       }catch(Exception e){
           System.out.println("loi connect"+e.toString());
           
       }
       return null;
   }
}

