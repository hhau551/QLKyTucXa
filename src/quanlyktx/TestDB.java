/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyktx;

import database.DataBaseHelper;
import java.sql.Connection;
import java.sql.DriverManager;
import modals.StudentDAO;
import modals.Students;

/**
 *
 * @author VuHoang
 */
public class TestDB {

    public static void main(String[] args) {
        Connection conn = DataBaseHelper.getDBConnect();
        StudentDAO dao = new StudentDAO();
        if (conn != null) {
            System.out.println("Connect thanh cong");
//            Students sv1 = new Students("PD21","GiaHuy","hoang@gmail.com","0955514705","Da Lat",true);
//            dao.add(sv1);
//            dao.update(sv1);
//            Students sv2 = new Students("PD111");
//            dao.delete(sv2);


               for(Students st : dao.getAll()){
                   System.out.println(st.toString());
               }
               Students find = dao.findStudentByID("PD20");
               if(find != null){
                   System.out.println("tim thay");
                    System.out.println(find.toString());
               }
        } else {
            System.out.println("Connect that bai");
        }

    }

}
