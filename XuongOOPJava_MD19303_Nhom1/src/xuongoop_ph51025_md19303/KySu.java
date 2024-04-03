
package xuongoop_ph51025_md19303;

import java.util.Scanner;


public class KySu extends CanBo {
    private String kyNang;
    private String nganh;
    private double phuCap;
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
    
    public void nhap() {
        super.nhap();
        System.out.print("Nhap ky nang: ");
        kyNang = scanner.nextLine();
        System.out.print("Nhap nganh: ");
        nganh = scanner.nextLine();
        System.out.print("Nhap phu cap: ");
        phuCap = Double.parseDouble(scanner.nextLine());
    }

    @Override
public Double getThuNhap() {
    return super.getThuNhap() + phuCap; 
}
    
}

