/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modals;
import database.DataBaseHelper;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author VuHoang
 */
public class StudentDAO {
    Connection conn =null;
    PreparedStatement sttm = null;
    public int add(Students st){
        try{
            String sSQL="insert SinhVien(MaSV,HoTen,Email,SoDT,DiaChi,GioiTinh)"
                    + "values (?,?,?,?,?,?)";

            conn = DataBaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,st.getMaSV());
            sttm.setString(2,st.getHoTen());
            sttm.setString(3,st.getEmail());
            sttm.setString(4,st.getSoDT());
            sttm.setString(5,st.getDiaChi());
            sttm.setBoolean(6,st.isGioiTinh());
            if(sttm.executeUpdate()>0){
                System.out.println("Insert thanh cong");
                return 1;
                
            }
        }catch (Exception e){
            System.out.println("error"+ e.toString());
        }
        return -1;
    }
    
    
    public int update(Students st){
        try{
            String sSQL="update SinhVien set HoTen = ? , Email=?,SoDT=?,DiaChi=?,GioiTinh =? where MaSV =?";

            conn = DataBaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(6,st.getMaSV());
            sttm.setString(1,st.getHoTen());
            sttm.setString(2,st.getEmail());
            sttm.setString(3,st.getSoDT());
            sttm.setString(4,st.getDiaChi());
            sttm.setBoolean(5,st.isGioiTinh());
            if(sttm.executeUpdate()>0){
                System.out.println("update thanh cong");
                return 1;
                
            }
        }catch (Exception e){
            System.out.println("error"+ e.toString());
        }
        return -1;
    }
    
    
    public int delete(String maSV){
        try{
            String sSQL="delete SinhVien where MaSV = ?";

            conn = DataBaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,maSV);
            if(sttm.executeUpdate()>0){
                System.out.println("delete thanh cong");
                return 1;
                
            }
        }catch (Exception e){
            System.out.println("error"+ e.toString());
        }
        return -1;
    }
    
    public List<Students> getAll(){
        
        List<Students> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from SinhVien";
            conn = DataBaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next()){
                
                Students st = new Students();
                st.setMaSV(rs.getString(1));
                st.setHoTen(rs.getString(2));
                st.setEmail(rs.getString(3));
                st.setSoDT(rs.getString(4));
                st.setDiaChi(rs.getString(5));
                st.setGioiTinh(rs.getBoolean(6));
                ls.add(st);
            }
            
        }catch(Exception e){
                System.out.println("Error:"+e.toString());
        }
        finally{
            
            try{
                rs.close(); sttm.close();conn.close();
            }catch(Exception e){
                
            }
        }
        return ls;
        
    }
    
    
      public Students findStudentByID(String maSV){
        
        
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from SinhVien where MaSV='"+maSV+"'";
            conn = DataBaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next()){
                
                Students st = new Students();
                st.setMaSV(rs.getString(1));
                st.setHoTen(rs.getString(2));
                st.setEmail(rs.getString(3));
                st.setSoDT(rs.getString(4));
                st.setDiaChi(rs.getString(5));
                st.setGioiTinh(rs.getBoolean(6));
                return st;
            }
            
        }catch(Exception e){
                System.out.println("Error:"+e.toString());
        }
        finally{
            
            try{
                rs.close(); sttm.close();conn.close();
            }catch(Exception e){
                
            }
        }
        return null;
        
    }
      
 
    
    

  public List<Students> findStudentByName(String name){
        
        
        ResultSet rs = null;
        Statement sttm = null;
        List<Students> ls = new ArrayList<>();
        try{
            String sSQL = "select * from SinhVien where HoTen like'%"+name+"%'";
            conn = DataBaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next()){
                
                Students st = new Students();
                st.setMaSV(rs.getString(1));
                st.setHoTen(rs.getString(2));
                st.setEmail(rs.getString(3));
                st.setSoDT(rs.getString(4));
                st.setDiaChi(rs.getString(5));
                st.setGioiTinh(rs.getBoolean(6));
                ls.add(st);
            }
            
        }catch(Exception e){
                System.out.println("Error:"+e.toString());
        }
        finally{
            
            try{
                rs.close(); sttm.close();conn.close();
            }catch(Exception e){
                
            }
        }
        return ls;
        
    }
      
      
      
      
      
      
      
}
