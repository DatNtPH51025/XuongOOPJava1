package xuongoop_ph51025_md19303;

import java.util.Scanner;

public class TruongPhong extends CanBo {
    Scanner scanner = new Scanner(System.in);
    private String heSoChucVu;
    private double luongTrachNhiem;

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public TruongPhong() {
    }

    @Override
public Double getThuNhap() {
    return super.getThuNhap() + luongTrachNhiem;
}

    @Override
    public void nhap() {
        super.nhap(); 
        System.out.println("Nhap luong trach nhiem: ");
        luongTrachNhiem = Double.parseDouble(scanner.nextLine());
        
    }
    
    
    
    

    
}
