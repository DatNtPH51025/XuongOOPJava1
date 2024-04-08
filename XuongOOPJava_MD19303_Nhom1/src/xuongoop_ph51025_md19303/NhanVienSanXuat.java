
package xuongoop_ph51025_md19303;

import java.util.Map;
import java.util.Scanner;
import xuongoop_ph51025_md19303.CanBo;

class NhanVienSanXuat extends CanBo {
    private int soSanPham;
    private double thuong;
    private String chucVu;

    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(int soSanPham, double thuong, String chucVu) {
        this.soSanPham = soSanPham;
        this.thuong = thuong;
        this.chucVu = chucVu;
    }

    public NhanVienSanXuat(int soSanPham, double thuong, String chucVu, int maCB, String hoTen, double luong, Map<String, Integer> phongBanCounts) {
        super(maCB, hoTen, luong, phongBanCounts);
        this.soSanPham = soSanPham;
        this.thuong = thuong;
        this.chucVu = chucVu;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    

    public double getThuong() {
        if (getSoSanPham() < 1000) {
            return (150000 * getSoSanPham());
        } else {
            return getSoSanPham() * 150000 + (getSoSanPham() - 1000) * 80000;
        }
    }

    
    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so san pham:");
        soSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap thuong:");
        thuong = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chuc vu (Nhan vien san Xuat Loai 1/Loai 2):");
        String inputChucVu = scanner.nextLine();
        if (inputChucVu.equalsIgnoreCase("Loai 1")) {
            setChucVu("Nhan vien san Xuat Loai 1");
        } else if (inputChucVu.equalsIgnoreCase("Loai 2")) {
            setChucVu("Nhan vien san Xuat Loai 2");
        } else {
            setChucVu("Nhan Vien san xuat "); // Mặc định 
        }

        }

    @Override
    public Double getThuNhap() {
        return getSoSanPham() + getThuong();
    }

    
 
}
