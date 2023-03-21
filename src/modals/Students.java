/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modals;

/**
 *
 * @author VuHoang
 */
public class Students {
    private String maSV,hoTen,email,soDT,diaChi;
    private boolean gioiTinh;

    public Students() {
    }

    public Students(String maSV) {
        this.maSV = maSV;
    }

    public Students(String maSV, String hoTen, String email, String soDT, String diaChi, boolean gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Students{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", email=" + email + ", soDT=" + soDT + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }
    
}
