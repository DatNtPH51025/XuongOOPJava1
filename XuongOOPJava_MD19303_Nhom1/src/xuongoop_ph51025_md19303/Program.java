package xuongoop_ph51025_md19303;

import java.util.Scanner;

public class Program {
    public static void hienThiMenu() {
        System.out.println("+================= Menu Phong Ban: =================+");
        System.out.println("+ 1. Nhap danh sach Nhan Vien                       +");
        System.out.println("+ 2. Hien Thi Danh Sach Nhan Vien                   +");
        System.out.println("+ 3. Tim Nhan Vien Bang Ma Nhan Vien                +");
        System.out.println("+ 4. Xoa nhan vien theo ma                          +");
        System.out.println("+ 5. Cap Nhat Thong Tin Nhan Vien                   +");
        System.out.println("+ 6. Tim Nhan Vien Theo Khoang Luong                +");
        System.out.println("+ 7. Sap Xep Nhan Vien Theo Ten                     +");
        System.out.println("+ 8. Sap Xep Nhan Vien Theo Thu Nhap                +");
        System.out.println("+ 9. Danh Sach 5 Nhan Vien Co Thu Nhap Cao Nhat     +");
        System.out.println("+ 10. Thong Ke Nhan Vien Theo Chuc Vu               +");
        System.out.println("+ 11. Xoa tat ca nhan vien                          +");
        System.out.println("+ 0. Thoat                                          +");
        System.out.println("+================******************=================+");
    }

    public static void main(String[] args) {
        QLcanBo QLCB = new QLcanBo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            hienThiMenu();
            System.out.print("Nhap lua chon cua ban: ");
            int luaChon; 
            try {
            luaChon = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Vui long nhap mot so nguyen.");
            continue;
        }
            switch (luaChon) {
                case 1:
                    System.out.println("----------Nhap danh sach nhan vien: ----------");
                    QLCB.NhapDanhSachTuBanPhim();
                    break;
                case 2:
                    System.out.println("----------Xuat danh sach nhan vien: ----------");
                    QLCB.XuatDanhSachNhanVien();
                    break;
                case 3:
                    QLCB.TimNhanVienTheoMa();
                    break;
                case 4:
                    QLCB.XoaNhanVienTheoMa();
                    break;
                case 5:
                    QLCB.CapNhatThongTin();
                    break;
                case 6:
                    QLCB.timNhanVenTheoKhoangLuong();
                    break;
                case 7:
                    QLCB.SapXepNhanVienTheoHoTen();
                    break;
                case 8:
                    QLCB.SapXepNhanVienTheoThuNhap();
                    break;
                case 9:
                    QLCB.SapXep5NhanVienThuNhapCaoNhat();
                    break;
                case 10:
                    QLCB.thongKeNhanVienTheoChucVu();
                   break;
                case 11:
                    QLCB.xoaTatCaNhanVien();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Moi chon lai.");
            }
        }
    }
}


