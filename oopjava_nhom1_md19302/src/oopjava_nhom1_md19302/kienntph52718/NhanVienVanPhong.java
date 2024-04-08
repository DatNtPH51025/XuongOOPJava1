/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava_nhom1_md19302;

/**
 *
 * @author admin
 */
public class NhanVienVanPhong {

    private int SoNgaylamViec;
    private double TangCa;
    private double luong;

    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(int SoNgaylamViec, double TangCa, double luong) {
        this.SoNgaylamViec = SoNgaylamViec;
        this.TangCa = TangCa;
        this.luong = luong;
    }

    public int getSoNgaylamViec() {
        return SoNgaylamViec;
    }

    public void setSoNgaylamViec(int SoNgaylamViec) {
        this.SoNgaylamViec = SoNgaylamViec;
    }

    public double getTangCa() {
        return TangCa;
    }

    public void setTangCa(double TangCa) {
        this.TangCa = TangCa;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

}
