package xuongoop_ph52751_md19303;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import xuongoop_ph52751_md19303.CanBoModel.CanBo;

public class DepartmentManager {
    private List<CanBo> danhSachNhanVien;
    private Scanner scanner;

    public DepartmentManager() {
        this.danhSachNhanVien = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Hàm thêm nhân viên vào danh sách
    public void themNhanVien(CanBo nhanVien) {
        danhSachNhanVien.add(nhanVien);
    }

    // Hàm tìm nhân viên theo mã nhân viên
    public CanBo timNhanVien(int maNhanVien) {
        for (CanBo nhanVien : danhSachNhanVien) {
            if (nhanVien.getMaNV() == maNhanVien) {
                return nhanVien;
            }
        }
        return null; // Không tìm thấy nhân viên
    }

    // Hàm xóa nhân viên theo mã nhân viên
    public void xoaNhanVien(int maNhanVien) {
        CanBo nhanVienCanXoa = null;
        for (CanBo nhanVien : danhSachNhanVien) {
            if (nhanVien.getMaNV() == maNhanVien) {
                nhanVienCanXoa = nhanVien;
                break;
            }
        }
        if (nhanVienCanXoa != null) {
            danhSachNhanVien.remove(nhanVienCanXoa);
            System.out.println("Nhân viên có mã " + maNhanVien + " đã được xóa.");
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + maNhanVien + ".");
        }
    }

    // Hàm chỉnh sửa thông tin của nhân viên
    public void capNhatThongTinNhanVien(int maNhanVien, String tenMoi, double thueMoi, double luongMoi) {
        CanBo nhanVienCanSua = timNhanVien(maNhanVien);
        if (nhanVienCanSua != null) {
            nhanVienCanSua.setHoTen(tenMoi);
            nhanVienCanSua.setThue(thueMoi);
            nhanVienCanSua.setLuong(luongMoi);
            System.out.println("Thông tin nhân viên đã được cập nhật thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + maNhanVien + ".");
        }
    }

    // Hàm tính thuế cho nhân viên
    public double tinhThueChoNhanVien(int maNhanVien) {
          CanBo nhanVien = null;
    for (CanBo cb : danhSachNhanVien) {
        if (cb.getMaNV() == maNhanVien) {
            nhanVien = cb;
            break;
        }
    }
    if (nhanVien != null) {
        // Sử dụng phương thức tính thuế của đối tượng CanBo
        nhanVien.Tinh_Thue();
        // Trả về thuế của nhân viên
        return nhanVien.getThue();
    } else {
        System.out.println("Không tìm thấy nhân viên có mã " + maNhanVien);
        return 0.0;
    }
    }

    // Hàm tính lương cho nhân viên
    public double tinhLuongChoNhanVien(int maNhanVien) {
        CanBo nhanVien = timNhanVien(maNhanVien);
        if (nhanVien != null) {
            double luong = nhanVien.getLuong() * (1 - tinhThueChoNhanVien(maNhanVien));
            return luong;
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + maNhanVien + ".");
            return 0.0;
        }
    }
    
    // Hàm nhập danh sách nhân viên từ bàn phím (Y1)
    private void nhapDanhSachNhanVienTuBanPhim() {
        System.out.print("Nhập số lượng nhân viên: ");
        int soLuongNhanVien = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ dòng trống

        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            System.out.print("Mã nhân viên: ");
            int maNV = scanner.nextInt();
            scanner.nextLine(); // Loại bỏ dòng trống
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Thuế: ");
            double thue = scanner.nextDouble();
            System.out.print("Lương: ");
            double luong = scanner.nextDouble();
            scanner.nextLine(); // Loại bỏ dòng trống

            CanBo nhanVien = new CanBo(maNV, hoTen, thue, luong);
            themNhanVien(nhanVien);
        }
    }
    
    // Hàm hiển thị danh sách nhân viên (Y2)
    private void hienThiDanhSachNhanVien() {
        System.out.println("Danh sách nhân viên:");
        System.out.printf("%-10s %-20s %-10s %-10s\n", "Mã NV", "Họ tên", "Thuế", "Lương");
        for (CanBo nhanVien : danhSachNhanVien) {
            System.out.println(nhanVien);
        }
    }
    
    // Hàm tìm và hiển thị thông tin nhân viên theo mã nhân viên (Y3)
    private void timVaHienThiNhanVienTheoMa() {
        System.out.print("Nhập mã nhân viên để tìm kiếm: ");
        int maTimKiem = scanner.nextInt();
        CanBo nhanVien = timNhanVien(maTimKiem);
        if (nhanVien != null) {
            System.out.println("Nhân viên được tìm thấy:");
            System.out.println(nhanVien);
        } else {
            System.out.println("Không tìm thấy nhân viên có mã " + maTimKiem + ".");
        }
    }
    
    // Hàm xóa nhân viên theo mã (Y4)
    private void xoaNhanVienTheoMa() {
        System.out.print("Nhập mã nhân viên để xóa: ");
        int maXoa = scanner.nextInt();
        xoaNhanVien(maXoa);
    }
    
    // Hàm cập nhật thông tin nhân viên (Y5)
    private void capNhatThongTinNhanVien() {
        System.out.print("Nhập mã nhân viên cần cập nhật: ");
        int maCapNhat = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ dòng trống
        System.out.print("Nhập tên mới: ");
        String tenMoi = scanner.nextLine();
        System.out.print("Nhập thuế mới: ");
        String thueMoi = scanner.nextLine();
        System.out.print("Nhập lương mới: ");
        double luongMoi = scanner.nextDouble();
        capNhatThongTinNhanVien(maCapNhat, tenMoi, thueMoi, luongMoi);
    }
    
    // Hàm tìm nhân viên theo khoảng lương (Y6)
    private void timNhanVienTheoKhoangLuong() {
        System.out.print("Nhập lương tối thiểu: ");
        double luongToiThieu = scanner.nextDouble();
        System.out.print("Nhập lương tối đa: ");
        double luongToiDa = scanner.nextDouble();
        System.out.println("Nhân viên trong khoảng lương:");
        for (CanBo nhanVien : danhSachNhanVien) {
            if (nhanVien.getLuong() >= luongToiThieu && nhanVien.getLuong() <= luongToiDa) {
                System.out.println(nhanVien);
            }
        }
    }
    
    // Hàm sắp xếp nhân viên theo tên (Y7)
    private void sapXepNhanVienTheoTen() {
        Collections.sort(danhSachNhanVien, Comparator.comparing(CanBo::getHoTen));
        hienThiDanhSachNhanVien();
    }
    
    // Hàm sắp xếp nhân viên theo lương (Y8)
    private void sapXepNhanVienTheoLuong() {
        Collections.sort(danhSachNhanVien, Comparator.comparingDouble(CanBo::getLuong));
        hienThiDanhSachNhanVien();
    }
    
    // Hàm hiển thị 5 nhân viên có lương cao nhất (Y9)
    private void hienThi5NhanVienCoLuongCaoNhat() {
        danhSachNhanVien.sort(Comparator.comparingDouble(CanBo::getLuong).reversed());
        System.out.println("5 Nhân viên có lương cao nhất:");
        int soLuong = Math.min(5, danhSachNhanVien.size());
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSachNhanVien.get(i));
        }
    }
    
    // Hàm hiển thị menu (Y1 đến Y9)
    public void hienThiMenu() {
        System.out.println("\nMenu Phòng Ban:");
        System.out.println("1. Thêm Nhân Viên");
        System.out.println("2. Hiện Thị Danh Sách Nhân Viên");
        System.out.println("3. Tìm Nhân Viên Bằng Mã Nhân Viên");
        System.out.println("4. Tính Thuế Cho Nhân Viên");
        System.out.println("5. Cập Nhật Thông Tin Nhân Viên");
        System.out.println("6. Tìm Nhân Viên Theo Khoảng Lương");
        System.out.println("7. Sắp Xếp Nhân Viên Theo Tên");
        System.out.println("8. Sắp Xếp Nhân Viên Theo Lương");
        System.out.println("9. Danh Sách 5 Nhân Viên Có Lương Cao Nhất");
        System.out.println("10. Thoát");
    }

    public static void main(String[] args) {
        DepartmentManager quanLyPhongBan = new DepartmentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            quanLyPhongBan.hienThiMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); // Loại bỏ dòng trống

            switch (luaChon) {
                case 1:
                    quanLyPhongBan.nhapDanhSachNhanVienTuBanPhim();
                    break;
                case 2:
                    quanLyPhongBan.hienThiDanhSachNhanVien();
                    break;
                case 3:
                    quanLyPhongBan.timVaHienThiNhanVienTheoMa();
                    break;
                case 4:
                    quanLyPhongBan.xoaNhanVienTheoMa();
                    break;
                case 5:
                    quanLyPhongBan.capNhatThongTinNhanVien();
                    break;
                case 6:
                    quanLyPhongBan.timNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    quanLyPhongBan.sapXepNhanVienTheoTen();
                    break;
                case 8:
                    quanLyPhongBan.sapXepNhanVienTheoLuong();
                    break;
                case 9:
                    quanLyPhongBan.hienThi5NhanVienCoLuongCaoNhat();
                    break;
                case 10:
                    System.out.println("Thoát chương trình...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
