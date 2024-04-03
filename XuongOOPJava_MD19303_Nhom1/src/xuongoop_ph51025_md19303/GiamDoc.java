package xuongoop_ph51025_md19303;

import java.util.Scanner;

public class GiamDoc extends CanBo {
    private String heSoChucVu;
    private double luongThuong;
    private double luongTrachNhiem;
    Scanner scanner = new Scanner(System.in);

    public GiamDoc() {
}

    public String getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(String heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    

    public void nhap() {
        super.nhap();
        System.out.print("Nhập hệ số chức vụ: ");
        this.heSoChucVu = scanner.nextLine();
        System.out.print("Nhập lương thưởng: ");
        this.luongThuong = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập lương trách nhiệm: ");
        this.luongTrachNhiem = Double.parseDouble(scanner.nextLine());
    }

    @Override
public Double getThuNhap() {
    return super.getThuNhap() + luongTrachNhiem + luongThuong; 
}

    
}

