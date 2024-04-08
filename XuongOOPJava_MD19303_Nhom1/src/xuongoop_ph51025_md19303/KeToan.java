
package xuongoop_ph51025_md19303;

import java.util.Scanner;


class KeToan extends CanBo {
    private String trinhDo;
    private String chucVu;
    private double luongThuong;

    public KeToan() {
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }
    
    @Override
public void nhap() {
    super.nhap();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap trinh do:");
    trinhDo = scanner.nextLine();
    System.out.println("Nhap chuc vu (Ke Toan Truong/Pho Ke Toan):");
    String inputChucVu = scanner.nextLine();
    // Thiết lập chức vụ tùy thuộc vào giá trị nhập vào
    if (inputChucVu.equalsIgnoreCase("Ke Toan Truong")) {
        setChucVu("Ke toan truong");
    } else if (inputChucVu.equalsIgnoreCase("Pho Ke Toan")) {
        setChucVu("Pho Ke Toan");
    } else {
        setChucVu("Nhan Vien Ke Toan"); // Mặc định 
    }
    System.out.println("Nhap luong thuong:");
    luongThuong = Double.parseDouble(scanner.nextLine());
}


    @Override
public Double getThuNhap() {
    return super.getThuNhap() + luongThuong; 
}

    

    
}
