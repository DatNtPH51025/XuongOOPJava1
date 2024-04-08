
package xuongoop_ph51025_md19303;

import java.util.Scanner;
import xuongoop_ph51025_md19303.CanBo;

class NhanVienSanXuat extends CanBo {
    private int soSanPham;
    private double thuong;
    private String chucVu;

    public NhanVienSanXuat() {
}

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public double getThuong() {
        if (getSoSanPham() < 1000) {
            return (150000 * getSoSanPham());
        } else {
            return getSoSanPham()*150000 +(getSoSanPham()-1000)*70000;
        }
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so san pham:");
        soSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap thuong:");
        thuong = Double.parseDouble(scanner.nextLine());
        setChucVu("Nhan Vien San Xuat");
    }

    @Override
public Double getThuNhap() {
    return getSoSanPham() + getThuong();
}

    
    
}
