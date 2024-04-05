/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canbo;


import java.util.Scanner;

    public class CanBo {
    private int maCB;
    private String hoTen;
    private double luong;
    Scanner scanner = new Scanner(System.in);
    
    public void nhap() {
        System.out.println("Nhap thong tin nhan vien !\n");
        System.out.print("Nhap Ma nhan vien: ");
        maCB = Integer.parseInt(scanner.nextLine());
        System.out.print("Ho và ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Lương: ");
        luong = Double.parseDouble(scanner.nextLine());
    }
    
    public Double getThuNhap(){
        return luong;
    }
    
    public float getThuetn() {
    if (getThuNhap() <= 9000000) {
        return 0;
    } else if (getThuNhap() <= 15000000) {
        return (float) (0.1 * getThuNhap()) ;
    } else {
        return (float) (0.12 * getThuNhap()) ;
    }
    }

    public int getMaCB() {
        return maCB;
    }

    public void setMaCB(int maCB) {
        this.maCB = maCB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void xuat() {
    System.out.printf("%-20s %-20s %-20s %-20f %-20f\n",
        maCB, hoTen, luong, getThuNhap(), getThuetn());
}

}
