package xuongoop_ph52751_md19303;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GiamDoc {
    static ArrayList<CanBo> danhSachNhanVien = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tìm và hiển thị nhân viên theo ID");
            System.out.println("4. Xóa nhân viên theo ID");
            System.out.println("5. Cập nhật thông tin nhân viên theo ID");
            System.out.println("6. Tìm nhân viên theo khoảng lương");
            System.out.println("7. Sắp xếp nhân viên theo họ");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập");
            System.out.println("9. Hiển thị 5 nhân viên có thu nhập cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Loại bỏ ký tự '\n'

            switch (luaChon) {
                case 1:
                    nhapDanhSachNhanVien();
                    break;
                case 2:
                    hienThiDanhSachNhanVien();
                    break;
                case 3:
                    timVaHienThiNhanVien();
                    break;
                case 4:
                    xoaNhanVien();
                    break;
                case 5:
                    capNhatThongTinNhanVien();
                    break;
                case 6:
                    timNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    sapXepNhanVienTheoHo();
                    break;
                case 8:
                    sapXepNhanVienTheoThuNhap();
                    break;
                case 9:
                    hienThi5NhanVienCoThuNhapCaoNhat();
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);
    }

    public static void nhapDanhSachNhanVien() {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ ký tự '\n'

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            System.out.print("Nhập mã nhân viên: ");
            int maNhanVien = scanner.nextInt();
            scanner.nextLine(); // Loại bỏ ký tự '\n'
            System.out.print("Nhập tên nhân viên: ");
            String tenNhanVien = scanner.nextLine();
            System.out.print("Nhập thuế: ");
            String thue = scanner.nextLine();
            System.out.print("Nhập lương: ");
            double luong = scanner.nextDouble();
            scanner.nextLine(); // Loại bỏ ký tự '\n'

            CanBo nhanVien = new CanBo(maNhanVien, tenNhanVien, thue, luong);
            danhSachNhanVien.add(nhanVien);
        }
    }

    public static void hienThiDanhSachNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return;
        }
        System.out.println("Danh sách nhân viên:");
        for (CanBo nhanVien : danhSachNhanVien) {
            System.out.println(nhanVien);
        }
    }

    public static void timVaHienThiNhanVien() {
        System.out.print("Nhập mã nhân viên cần tìm: ");
        int maNV = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ ký tự '\n'

        boolean timThay = false;
        for (CanBo nhanVien : danhSachNhanVien) {
            if (nhanVien.getMaNV() == maNV) {
                System.out.println("Nhân viên được tìm thấy:");
                System.out.println(nhanVien);
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy nhân viên có mã " + maNV + ".");
        }
    }

    public static void xoaNhanVien() {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        int maNV = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ ký tự '\n'

        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (danhSachNhanVien.get(i).getMaNV() == maNV) {
                danhSachNhanVien.remove(i);
                System.out.println("Nhân viên có mã " + maNV + " đã được xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên có mã " + maNV + ".");
    }

    public static void capNhatThongTinNhanVien() {
        System.out.print("Nhập mã nhân viên cần cập nhật: ");
        int maNV = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ ký tự '\n'

        for (CanBo nhanVien : danhSachNhanVien) {
            if (nhanVien.getMaNV() == maNV) {
                System.out.println("Nhập thông tin mới cho nhân viên có mã " + maNV + ":");
                System.out.print("Nhập tên mới: ");
                nhanVien.setTenNV(scanner.nextLine());
                System.out.print("Nhập thuế mới: ");
                nhanVien.setThue(scanner.nextLine());
                System.out.print("Nhập lương mới: ");
                nhanVien.setLuong(scanner.nextDouble());
                scanner.nextLine(); // Loại bỏ ký tự '\n'
                System.out.println("Thông tin của nhân viên đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên có mã " + maNV + ".");
    }

    public static void timNhanVienTheoKhoangLuong() {
        System.out.print("Nhập lương tối thiểu: ");
        double luongToiThieu = scanner.nextDouble();
        System.out.print("Nhập lương tối đa: ");
        double luongToiDa = scanner.nextDouble();
        scanner.nextLine(); // Loại bỏ ký tự '\n'

        boolean timThay = false;
        System.out.println("Nhân viên trong khoảng lương từ " + luongToiThieu + " đến " + luongToiDa + ":");
        for (CanBo nhanVien : danhSachNhanVien) {
            if (nhanVien.getLuong() >= luongToiThieu && nhanVien.getLuong() <= luongToiDa) {
                System.out.println(nhanVien);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy nhân viên nào trong khoảng lương đã cho.");
        }
    }

    public static void sapXepNhanVienTheoHo() {
        Collections.sort(danhSachNhanVien, Comparator.comparing(CanBo::getTenNV));
        System.out.println("Danh sách nhân viên được sắp xếp theo họ:");
        for (CanBo nhanVien : danhSachNhanVien) {
            System.out.println(nhanVien);
        }
    }

    public static void sapXepNhanVienTheoThuNhap() {
        Collections.sort(danhSachNhanVien, Comparator.comparing(CanBo::getLuong));
        System.out.println("Danh sách nhân viên được sắp xếp theo thu nhập:");
        for (CanBo nhanVien : danhSachNhanVien) {
            System.out.println(nhanVien);
        }
    }

    public static void hienThi5NhanVienCoThuNhapCaoNhat() {
        if (danhSachNhanVien.size() < 5) {
            System.out.println("Có ít hơn 5 nhân viên.");
            return;
        }
        System.out.println("5 nhân viên có thu nhập cao nhất:");
        for (int i = 0; i < 5; i++) {
            System.out.println(danhSachNhanVien.get(i));
        }
    }
}

class CanBo {
    private int maNV;
    private String tenNV;
    private String thue;
    private double luong;

    public CanBo(int maNV, String tenNV, String thue, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.thue = thue;
        this.luong = luong;
    }

    public int getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getThue() {
        return thue;
    }

    public void setThue(String thue) {
        this.thue = thue;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Mã NV: " + maNV + ", Tên NV: " + tenNV + ", Thuế: " + thue + ", Lương: " + luong;
    }
}
