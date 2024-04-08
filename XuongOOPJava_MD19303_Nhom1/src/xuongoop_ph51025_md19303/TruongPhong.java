package xuongoop_ph51025_md19303;

import java.util.Scanner;

public class TruongPhong extends CanBo {
    private double luongTrachNhiem;
    private String chucVu; // Loại trưởng phòng được xem xét như một chức vụ
    Scanner scanner = new Scanner(System.in);

    public TruongPhong() {
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public Double getThuNhap() {
        return super.getThuNhap() + luongTrachNhiem;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        System.out.print("Nhap luong trach nhiem: ");
        luongTrachNhiem = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap loai truong phong (TaiChinh/KinhDoanh): ");
        String inputLoai = scanner.nextLine();
        // Thiết lập loại trưởng phòng dựa trên giá trị nhập vào
        if (inputLoai.equalsIgnoreCase("TaiChinh")) {
            chucVu = "Trưởng Phòng Tài Chính";
        } else if (inputLoai.equalsIgnoreCase("KinhDoanh")) {
            chucVu = "Trưởng Phòng Kinh Doanh";
        } else {
            chucVu = "Trưởng Phòng Nhan sư"; // Mặc định là "Trưởng Phòng" nếu không nhập đúng loại
        }
    }
}

    

