
package xuongoop_ph51025_md19303;

import java.util.Scanner;
import xuongoop_ph51025_md19303.CanBo;


class NhanVienVanPhong extends CanBo{
    private int soNgayLamViec;
    private double tangCa;
    private String chucVu;
    Scanner scanner = new Scanner(System.in);

    public NhanVienVanPhong() {
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
    setChucVu("Nhân Viên Văn Phòng");
}

    @Override
public Double getThuNhap() {
    return getSoNgayLamViec() * 200000 + getTangCa() * 100000; 
}
    
}
