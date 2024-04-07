/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava_nhom1_md19302;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class NhanVien {

    String ten;
    double thuNhap;

    public NhanVien(String ten, double thuNhap) {
        this.ten = ten;
        this.thuNhap = thuNhap;
    }
}

/**
 *
 * @author admin
 */
public class ChucNang {

    public static void main(String[] args) {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    themNhanVien();
                    break;
                case 2:
                    timKiemNhanVien();
                    break;
                case 3:
                    hienThiDanhSachNhanVien();
                    break;
                case 4:
                    sapXepNhanVien();
                    break;
                case 5:
                    hienThiTheoThuNhap();
                    break;
                case 6:
                    xoaNhanVien();
                    break;
                case 7:
                    hienThiTheoTen();
                    break;
                case 8:
                    themKeToanMoi();
                    break;
                case 9:
                    hienThiTop5NhanVien();
                    break;
                case 10:
                    xoaTatCaNhanVien();
                    break;
                case 0:
                    System.out.println("Cam on da su dung!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Moi nhap lai.");
            }
        } while (choice != 0);

        scanner.close();
    }

    static void showMenu() {
        System.out.println("+--------MENU-------+");
        System.out.println("1.Them nhan vien vao ke toan");
        System.out.println("2.Tim kiem nhan vien");
        System.out.println("3.Hien thi danh sach nhan vien");
        System.out.println("4.Sap xep nhan vien");
        System.out.println("5.Hien thi theo thu nhap");
        System.out.println("6.Xoa nhan vien ra khoi ke toan");
        System.out.println("7.Hien thi theo ten");
        System.out.println("8.Them 1 ke toan moi");
        System.out.println("9.Top 5 nhan vien");
        System.out.println("10.Xoa tat ca nhan vien");
        System.out.println("0.Thoat");
        System.out.println("+------------------+");
        System.out.print("Moi van phong ( hanh chinh ) chon: ");
    }

    static void themNhanVien() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap thu nhap: ");
        double thuNhap = scanner.nextDouble();
        danhSachNhanVien.add(new NhanVien(ten, thuNhap));
        System.out.println("Da them nhan vien: " + ten);
    }

    static void timKiemNhanVien() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien can tim: ");
        String ten = scanner.nextLine();
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.ten.equals(ten)) {
                System.out.println("Nhan vien tim thay: " + nv.ten + ", Thu nhap: " + nv.thuNhap);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien co ten: " + ten);
    }

    static void hienThiDanhSachNhanVien() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sach nhan vien:");
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println("Ten: " + nv.ten + ", Thu nhap: " + nv.thuNhap);
        }
    }

    static void sapXepNhanVien() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Collections.sort(danhSachNhanVien, Comparator.comparingDouble(nv -> nv.thuNhap));
        System.out.println("Da sap xep danh sach nhan vien theo thu nhap");
    }

    static void hienThiTheoThuNhap() {
        sapXepNhanVien();
        hienThiDanhSachNhanVien();
    }

    static void xoaNhanVien() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien can xoa: ");
        String ten = scanner.nextLine();
        danhSachNhanVien.removeIf(nv -> nv.ten.equals(ten));
        System.out.println("Da xoa nhan vien co ten: " + ten);
    }

    static void hienThiTheoTen() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien can hien thi: ");
        String ten = scanner.nextLine();
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.ten.equals(ten)) {
                System.out.println("Ten: " + nv.ten + ", Thu nhap: " + nv.thuNhap);
            }
        }
    }

    static void themKeToanMoi() {
        System.out.println("Chuc nang them ke toan moi");
    }

    static void hienThiTop5NhanVien() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Top 5 nhan vien co thu nhap cao nhat:");
        if (danhSachNhanVien.size() < 5) {
            System.out.println("Danh sach nhan vien khong du 5 nguoi");
            return;
        }
        Collections.sort(danhSachNhanVien, Comparator.comparingDouble(nv -> -nv.thuNhap));
        for (int i = 0; i < 5; i++) {
            System.out.println("Ten: " + danhSachNhanVien.get(i).ten + ", Thu nhap: " + danhSachNhanVien.get(i).thuNhap);
        }
    }

    static void xoaTatCaNhanVien() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        danhSachNhanVien.clear();
        System.out.println("Da xoa tat ca nhan vien");
    }
}
