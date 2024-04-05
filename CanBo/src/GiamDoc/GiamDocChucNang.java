package GiamDoc;

import canbo.CanBo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GiamDocChucNang {
    ArrayList<CanBo> danhSachNhanVien = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void tuyenNhanVien() {
        CanBo canbo = new CanBo();       
        canbo.nhap();
        danhSachNhanVien.add(canbo);
    }
    
    public void hienThiNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh Sách Nhân Viên Trống!");
            return;
        }
        for (CanBo canBo : danhSachNhanVien) {
            canBo.xuat();
        }
    }
    
    public void saThaiNhanVien() {
        System.out.print("Nhập mã nhân viên cần sa thải: ");
        int maCanBo = scanner.nextInt();
        boolean found = false;
        for (CanBo canBo : danhSachNhanVien) {
            if (canBo.getMaCB() == maCanBo) {
                danhSachNhanVien.remove(canBo);
                found = true;
                System.out.println("Đã sa thải nhân viên có mã " + maCanBo);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên có mã " + maCanBo);
        }
    }
    
    public void tinhLuongNhanVien() {
        System.out.println("Danh sách lương của nhân viên:");
        for (CanBo canBo : danhSachNhanVien) {
            System.out.println("Mã: " + canBo.getMaCB() + ", Lương: " + canBo.getLuong());
        }
    }
    
    public void tinhThueNhanVien() {
        System.out.println("Danh sách thuế của nhân viên:");
        for (CanBo canBo : danhSachNhanVien) {
            System.out.println("Mã: " + canBo.getMaCB() + ", Thuế: " + canBo.getThuetn());
        }
    }
    
     public void timKiemNhanVien() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập mã nhân viên cần tìm kiếm: ");
    int maNhanVien = scanner.nextInt();
    boolean found = false;
    
    for (CanBo canBo : danhSachNhanVien) {
        if (canBo.getMaCB() == maNhanVien) {
            found = true;
            System.out.println("Thông tin nhân viên:");
            canBo.xuat();
            break;
        }
    }
    
    if (!found) {
        System.out.println("Không tìm thấy nhân viên có mã " + maNhanVien);
    }
}

    public void SapxepNhanVienTheoLuong() {
        Collections.sort(danhSachNhanVien, Comparator.comparingDouble(CanBo::getLuong));
    }

    public void TinhLuongThuong(double phanTramThuong) {
        for (CanBo canBo : danhSachNhanVien) {
            double luongThuong = canBo.getLuong() * phanTramThuong / 100;
            canBo.setLuong(canBo.getLuong() + luongThuong);
        }
    }

    public void tinhLuongTrachNghiem(double phanTramTrachNghiem) {
        for (CanBo canBo : danhSachNhanVien) {
            double luongTrachNghiem = canBo.getLuong() * phanTramTrachNghiem / 100;
            canBo.setLuong(canBo.getLuong() - luongTrachNghiem);
        }
    }

    public void top3NV() {
        if (danhSachNhanVien.size() < 3) {
            System.out.println("Danh sách nhân viên ít hơn 3 người.");
            return;
        }
        // Sort danhSachNhanVien by salary in descending order
        Collections.sort(danhSachNhanVien, Comparator.comparingDouble(CanBo::getLuong).reversed());
        // Display top 3 employees
        System.out.println("Top 3 nhân viên có lương cao nhất:");
        for (int i = 0; i < 3; i++) {
            CanBo canBo = danhSachNhanVien.get(i);
            System.out.println("Mã: " + canBo.getMaCB() + ", Lương: " + canBo.getLuong());
        }
    }

}
