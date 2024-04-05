package PhoTruongPhong;


import canbo.PhongBan;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import canbo.CanBo;
import java.util.Iterator;

public class MenuPhoTP {

    ArrayList<CanBo> danhSachNhanVien = new ArrayList<>();
    ArrayList<PhongBan> danhSachPhongBan = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void themNhanVien() {
        CanBo canBo = new CanBo();
        canBo.nhap();
        danhSachNhanVien.add(canBo);
    }

    public void timKiemNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống!");
            return;
        }

        System.out.println("Nhập mã nhân viên hoặc tên nhân viên cần tìm: ");
        String input = scanner.nextLine();
        boolean found = false;

        for (CanBo canBo : danhSachNhanVien) {
            if (String.valueOf(canBo.getMaCB()).equals(input) || canBo.getHoTen().equalsIgnoreCase(input)) {
                System.out.println("Nhân viên được tìm thấy:");
                canBo.xuat();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân viên với thông tin đã nhập.");
        }
    }

    public void hienThiDanhSachNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống!");
            return;
        }
        for (CanBo canBo : danhSachNhanVien) {
            canBo.xuat();
        }
    }

    public void sapXepNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống!");
            return;
        }

        // Sắp xếp nhân viên theo mã nhân viên
        danhSachNhanVien.sort(Comparator.comparingInt(CanBo::getMaCB));

        System.out.println("Danh sách nhân viên sau khi sắp xếp:");
        for (CanBo canBo : danhSachNhanVien) {
            canBo.xuat();
        }
    }

    public void hienThiTheoThuNhap() {
        // TODO: Triển khai chức năng hiển thị theo thu nhập của nhân viên
    }

    public void xoaNhanVienRaKhoiPhongBan() {
        System.out.print("Nhập mã nhân viên cần xóa khỏi phòng ban: ");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
        Iterator<CanBo> iterator = danhSachNhanVien.iterator();
        while (iterator.hasNext()) {
            CanBo canBo = iterator.next();
            if (canBo.getMaCB() == maNhanVien) {
                iterator.remove();
                System.out.println("Đã xóa nhân viên có mã " + maNhanVien + " ra khỏi phòng ban.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên có mã " + maNhanVien + " trong phòng ban.");
    }

    public void hienThiTheoTen() {
        System.out.print("Nhập tên nhân viên cần hiển thị: ");
        String tenNhanVien = scanner.nextLine();
        System.out.println("Danh sách nhân viên có tên " + tenNhanVien + ":");
        boolean found = false;
        for (CanBo canBo : danhSachNhanVien) {
            if (canBo.getHoTen().equalsIgnoreCase(tenNhanVien)) {
                canBo.xuat();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với tên đã nhập.");
        }
    }

    public void themPhongBanMoi() {
        System.out.print("Nhập tên phòng ban mới: ");
        String tenPhongBan = scanner.nextLine();
        danhSachPhongBan.add(new PhongBan(0, tenPhongBan)); // Mã phòng ban được đặt tạm thời là 0
        System.out.println("Đã thêm phòng ban " + tenPhongBan);
    }

    public void hienThiTatCaPhongBan() {
        if (danhSachPhongBan.isEmpty()) {
            System.out.println("Danh sách phòng ban trống!");
            return;
        }
        System.out.println("Danh sách phòng ban:");
        for (PhongBan phongBan : danhSachPhongBan) {
            System.out.println(phongBan.getTenPhongBan());
        }
    }

    public void xoaTatCaNhanVien() {
        danhSachNhanVien.clear();
        System.out.println("Đã xóa tất cả nhân viên ra khỏi phòng ban.");
    }
}
