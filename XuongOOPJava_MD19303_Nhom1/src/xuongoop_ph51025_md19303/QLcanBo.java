package xuongoop_ph51025_md19303;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class QLcanBo {

    private ArrayList<CanBo> dsCB = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    int n;
    private Map<String, Integer> chucVuCounts = new HashMap<>();;

    public void NhapDanhSachTuBanPhim() {
        System.out.println("Moi ban nhap so can bo: ");
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Moi nhan can bo thu " + (i + 1) + " :");
            System.out.println("1. Nhan vien Van phong   2. Nhan vien san xuat   3. Ke toan \n"
                    + "4. Ky su   5. Truong Phong   6. Giam doc");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    NhanVienVanPhong nvvp = new NhanVienVanPhong();
                    nvvp.nhap();
                    dsCB.add(nvvp);
                    break;
                case 2:
                    NhanVienSanXuat nvsx = new NhanVienSanXuat();
                    nvsx.nhap();
                    dsCB.add(nvsx);
                    break;
                case 3:
                    KeToan kt = new KeToan();
                    kt.nhap();
                    dsCB.add(kt);
                    break;
                case 4:
                    KySu ks = new KySu();
                    ks.nhap();
                    dsCB.add(ks);
                    break;
                case 5:
                    TruongPhong Tp = new TruongPhong();
                    Tp.nhap();
                    dsCB.add(Tp);
                    break;
                case 6:
                    GiamDoc Gd = new GiamDoc();
                    Gd.nhap();
                    dsCB.add(Gd);
                    break;
                default:
                    System.out.println("Moi ban chon lai!");
                    break;
            }
        }
    }

    //xuất danh sách nhân viên
    public void XuatDanhSachNhanVien() {
        if (dsCB.isEmpty()) {
            System.out.println("Danh sach can bo rong.");
        } else {
            System.out.println("---------------Danh sach can bo: ---------------");
            System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "maCb", "hoTen", "Luong", "ThuNhap", "Thuetn");
            for (CanBo CB : dsCB) {
                CB.xuat();
            }
        }

    }

    public void TimNhanVienTheoMa() {
        Scanner pp = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien muon tim: ");
        int Ma = Integer.parseInt(pp.nextLine()); // Chuyển mã nhân viên sang kiểu int
        System.out.println("--------------Thong tin nhan vien ban muon tim: ---------------");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "maCb", "hoTen", "Lương", "ThuNhap", "Thuetn");
        for (CanBo CanBo : dsCB) {
            if (CanBo.getMaCB() == Ma) { // So sánh mã nhân viên
                CanBo.xuat(); // In thông tin của nhân viên có mã tương ứng
                return; // Dừng vòng lặp sau khi tìm thấy và in thông tin nhân viên
            }
        }
        System.out.println("Khong tim thay nhan vien voi ma " + Ma);
    }

    public void XoaNhanVienTheoMa() {
        System.out.println("Nhap ma nhan vien muon xoa: ");
        String maXoaStr = scanner.nextLine();
        if (maXoaStr.isEmpty()) {
            System.out.println("Khong co ma nhap vao. Vui long nhap lai!");
        } else {
            try {
                int maXoa = Integer.parseInt(maXoaStr); // Chuyển đổi mã nhân viên sang kiểu số nguyên
                // Kiểm tra xem mã nhân viên có tồn tại trong danh sách không
                boolean found = false;
                for (CanBo CB : dsCB) {
                    if (maXoa == CB.getMaCB()) {
                        dsCB.remove(CB);
                        found = true;
                        break;
                    }
                }
                // Nếu không tìm thấy mã nhân viên trong danh sách
                if (!found) {
                    System.out.println("Khong tim thay nhan vien co ma " + maXoa + " trong danh sach. Khong co gi de xoa.");
                } else {
                    System.out.println("Da xoa thanh cong nhan vien co ma " + maXoa + " trong danh sach.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ma nhap vao khong hop le. Vui long nhap lai!");
            }
        }
        XuatDanhSachNhanVien();

    }

    public void CapNhatThongTin() {
        System.out.println("Nhap ma nhan vien muon cap nhat: ");
        String Ma = scanner.nextLine();
        boolean found = false; // Biến để kiểm tra xem có tìm thấy nhân viên cần cập nhật không
        for (CanBo CB : dsCB) {
            if (Integer.toString(CB.getMaCB()).equals(Ma)) { // Kiểm tra xem mã có trùng khớp không
                System.out.println("-------------- Cap nhat thong tin nhan vien: ---------------");
                CB.nhap();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay nhan vien voi ma da nhap.");
        }

        XuatDanhSachNhanVien();

    }

    public void timNhanVenTheoKhoangLuong() {
        System.out.println("-----Nhap vao khoang luong ban muon tim:-----");
        double min, max;
        while (true) {
            System.out.println("Nhap vao min luong: ");
            if (scanner.hasNextDouble()) {
                min = scanner.nextDouble();
                break;
            } else {
                System.out.println("Vui long nhap so!");
                scanner.next(); // Đọc và loại bỏ dữ liệu không hợp lệ khỏi bộ nhớ đệm
            }
        }
        while (true) {
            System.out.println("Nhap vao max luong: ");
            if (scanner.hasNextDouble()) {
                max = scanner.nextDouble();
                if (max >= min) {
                    break;
                } else {
                    System.out.println("Max luong phai lon hon hoac bang min luong.");
                }
            } else {
                System.out.println("Vui long nhap so!");
                scanner.next(); // Đọc và loại bỏ dữ liệu không hợp lệ khỏi bộ nhớ đệm
            }
        }

        System.out.println("--------------- Danh sach can bo co luong trong khoang tu " + min + " den " + max + " ---------------");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "maCb", "hoTen", "Luong", "ThuNhap", "Thuetn");
        boolean found = false; // Biến để kiểm tra xem có tìm thấy nhân viên trong khoảng lương cho trước không
        for (CanBo CB : dsCB) {
            if (CB.getLuong() >= min && CB.getLuong() <= max) {
                CB.xuat();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co can bo nao co luong trong khoang tu " + min + " den " + max);
        }

    }

    public void SapXepNhanVienTheoHoTen() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ban muon sap xep danh sach tu tren xuong hay tu duoi len?");
            System.out.println("1. Tu tren xuong");
            System.out.println("2. Tu duoi len");
            System.out.print("Chon: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    sapXepTuTrenXuong();
                    break;
                case 2:
                    sapXepTuDuoiLen();
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } catch (InputMismatchException e) {
            System.err.println("Nhap khong hop le. Vui long nhap 1 hoac 2.");
        } finally {
            scanner.close(); // Đóng Scanner sau khi sử dụng xong
        }
    }

    public void sapXepTuTrenXuong() {
        // Kiểm tra nếu danh sách rỗng
        if (dsCB.isEmpty()) {
            System.out.println("Danh sach nhan vien trong. Khong co gi de sap xep.");
            return;
        }

        // Sắp xếp từ trên xuống và hiển thị danh sách
        Comparator<CanBo> comp = Comparator.comparing(CanBo::getHoTen).reversed();
        Collections.sort(dsCB, comp);
        XuatDanhSachNhanVien();
    }

    public void sapXepTuDuoiLen() {
        // Kiểm tra nếu danh sách rỗng
        if (dsCB.isEmpty()) {
            System.out.println("Danh sach nhan vien trong. Khong co gi de sap xep.");
            return;
        }

        // Sắp xếp từ dưới lên và hiển thị danh sách
        Comparator<CanBo> comp = Comparator.comparing(CanBo::getHoTen);
        Collections.sort(dsCB, comp);
        XuatDanhSachNhanVien();
    }

    public void SapXepNhanVienTheoThuNhap() {
        Comparator<CanBo> comp = new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return Double.compare(o2.getThuNhap(), o1.getThuNhap());
            }
        };

        if (!dsCB.isEmpty()) {
            Collections.sort(dsCB, comp);
            XuatDanhSachNhanVien();
        } else {
            System.out.println("Danh sach nhan vien trong. Khong co gi de sap xep.");
        }

    }

    public void SapXep5NhanVienThuNhapCaoNhat() {

        Comparator<CanBo> comp = new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return Double.compare(o2.getThuNhap(), o1.getThuNhap());
            }
        };

        Collections.sort(dsCB, comp);
        System.out.println("---------- 5 Nhan vien co thu nhap cao nhat: ----------");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "maCb", "hoTen", "Lương", "ThuNhap", "Thuetn");

        int limit = Math.min(5, dsCB.size());
        for (int i = 0; i < limit; i++) {
            dsCB.get(i).xuat();
        }

    }

    public void thongKeNhanVienTheoChucVu() {
    for (CanBo canBo : dsCB) {
        String chucVu = canBo.getChucVu();
        // Kiểm tra xem chức vụ đã tồn tại trong Map hay chưa
        if (chucVuCounts.containsKey(chucVu)) {
            // Nếu đã tồn tại, tăng số lượng lên 1
            chucVuCounts.put(chucVu, chucVuCounts.get(chucVu) + 1);
        } else {
            // Nếu chưa tồn tại, thêm chức vụ mới vào Map với số lượng là 1
            chucVuCounts.put(chucVu, 1);
        }
    }

    // In ra kết quả thống kê
    System.out.println("Thong ke so luong nhan vien theo chuc vu:");
    for (Map.Entry<String, Integer> entry : chucVuCounts.entrySet()) {
        System.out.println("Chuc vu: " + entry.getKey() + ", So luong nhan vien: " + entry.getValue());
    }
}



    public void xoaTatCaNhanVien() {
        dsCB.clear();
        System.out.println("Da xoa tat ca nhan vien.");
    }
}
