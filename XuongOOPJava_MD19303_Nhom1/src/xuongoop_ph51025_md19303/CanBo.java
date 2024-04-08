package xuongoop_ph51025_md19303;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class CanBo {
    private int maCB;
    private String hoTen;
    private double luong;
    private String chucVu;
    Scanner scanner = new Scanner(System.in);

    public CanBo() {  
    }

    public CanBo(int maCB, String hoTen, double luong, Map<String, Integer> phongBanCounts) {
        this.maCB = maCB;
        this.hoTen = hoTen;
        this.luong = luong;
        
    }
    
    public void nhap() {
        System.out.println("Nhap thong tin nhan vien !");
        System.out.print("Nhap Ma can bo: ");
        maCB = Integer.parseInt(scanner.nextLine());
        System.out.print("Ho va ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Luong: ");
        luong = Double.parseDouble(scanner.nextLine());
    }
    
    public Double getThuNhap(){
        return luong;
    }
    
    public float getThuetn() {
    if (getThuNhap() <= 9000000) {
        return 0;
    } else if (getThuNhap() <= 15000000) {
        return (float) (0.1 * getThuNhap()) ;
    } else {
        return (float) (0.12 * getThuNhap()) ;
    }
    }

    public int getMaCB() {
        return maCB;
    }

    public void setMaCB(int maCB) {
        this.maCB = maCB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void xuat() {
    System.out.printf("%-20s %-20s %-20s %-20f %-20f\n",
        maCB, hoTen, luong, getThuNhap(), getThuetn());
}

}

