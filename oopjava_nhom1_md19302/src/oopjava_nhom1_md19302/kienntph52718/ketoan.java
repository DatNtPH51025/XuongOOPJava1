/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava_nhom1_md19302;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class KeToan extends CanBo {

    private String trinhDo;
    private String chucVu;
    private double luongThuong;

    public KeToan() {
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public KeToan(String trinhDo, String chucVu, double luongThuong) {
        this.trinhDo = trinhDo;
        this.chucVu = chucVu;
        this.luongThuong = luongThuong;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap trinh do:");
        trinhDo = scanner.nextLine();
        System.out.println("Nhap chuc vu:");
        chucVu = scanner.nextLine();
        System.out.println("Nhap luong thuong:");
        luongThuong = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public Double getThuNhap() {
        return super.getThuNhap() + luongThuong;
    }
}
