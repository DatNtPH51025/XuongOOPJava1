
package xuongoop_ph51025_md19303;

import java.util.Map;
import java.util.Scanner;
import xuongoop_ph51025_md19303.CanBo;


class NhanVienVanPhong extends CanBo{
    private int soNgayLamViec;
    private double tangCa;
    private String chucVu;
    Scanner scanner = new Scanner(System.in);

    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(int soNgayLamViec, double tangCa, String chucVu) {
        this.soNgayLamViec = soNgayLamViec;
        this.tangCa = tangCa;
        this.chucVu = chucVu;
    }

    public NhanVienVanPhong(int soNgayLamViec, double tangCa, String chucVu, int maCB, String hoTen, double luong, Map<String, Integer> phongBanCounts) {
        super(maCB, hoTen, luong, phongBanCounts);
        this.soNgayLamViec = soNgayLamViec;
        this.tangCa = tangCa;
        this.chucVu = chucVu;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public double getTangCa() {
        return tangCa;
    }

    public void setTangCa(double tangCa) {
        this.tangCa = tangCa;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    
    @Override
public void nhap() {
    super.nhap();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so ngay lam viec:");
    soNgayLamViec = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhap so gio lam them:");
    tangCa = Double.parseDouble(scanner.nextLine());
    System.out.println("Nhap chuc vu (Nhan vien Van Phong Loai 1/Loai 2):");
    String inputChucVu = scanner.nextLine();
    // Thiết lập chức vụ tùy thuộc vào giá trị nhập vào
        if (inputChucVu.equalsIgnoreCase("Loai 1")) {
            setChucVu("Nhan vien Van Phong Loai 1");
        } else if (inputChucVu.equalsIgnoreCase("Loai 2")) {
            setChucVu("Nhan vien Van Phong Loai 2");
        } else {
            setChucVu("Nhan Vien Van Phong"); // Mặc định 
        }
}

    @Override
public Double getThuNhap() {
    return getSoNgayLamViec() * 200000 + getTangCa() * 100000; 
}
    
}
