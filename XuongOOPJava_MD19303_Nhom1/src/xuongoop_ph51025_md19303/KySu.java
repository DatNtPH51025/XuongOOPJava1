
package xuongoop_ph51025_md19303;

import java.util.Scanner;


public class KySu extends CanBo {
    private String kyNang;
    private String nganh;
    private double phuCap;
    private String chucVu; // Loại kỹ sư được xem xét như một chức vụ
    Scanner scanner = new Scanner(System.in);

    public KySu() {
    }

    public String getKyNang() {
        return kyNang;
    }

    public void setKyNang(String kyNang) {
        this.kyNang = kyNang;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public String getChucVu() {
        return chucVu;
    }

    @Override
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap ky nang: ");
        kyNang = scanner.nextLine();
        System.out.print("Nhap phu cap: ");
        phuCap = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap loai ky su (PhanMem/PhanCung): ");
        String loaiKySu = scanner.nextLine();
        // Thiết lập chức vụ dựa trên loại kỹ sư
        if (loaiKySu.equalsIgnoreCase("PhanMem")) {
            chucVu = "Ky Su Phan Mem";
        } else if (loaiKySu.equalsIgnoreCase("PhanCung")) {
            chucVu = "Ky Su Phan Cung";
        } else {
            chucVu = "Ky Su"; 
        }
    }

    @Override
    public Double getThuNhap() {
        return super.getThuNhap() + phuCap;
    }
}

    


