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
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Nhap trinh do:");
    String trinhDo = scanner.nextLine();
    
    System.out.println("Nhap chuc vu (Giam Doc Tai Chinh/Giam Doc Tiep Thi):");
    String inputChucVu = scanner.nextLine();
    
    // Thiết lập chức vụ tùy thuộc vào giá trị nhập vào
    if (inputChucVu.equalsIgnoreCase("Giam Doc Tai Chinh")) {
        setChucVu("Giam Doc Tai Chinh");
    } else if (inputChucVu.equalsIgnoreCase("Giam Doc Tiep Thi")) {
        setChucVu("Giam Doc Tiep Thi");
    } else {
        setChucVu("Giam Doc Dieu Hanh"); 
    }
    
    System.out.println("Nhap luong thuong:");
    luongThuong = Double.parseDouble(scanner.nextLine());
}

    @Override
    public Double getThuNhap() {
        return super.getThuNhap() + luongTrachNhiem + luongThuong;
    }

    
}


    


