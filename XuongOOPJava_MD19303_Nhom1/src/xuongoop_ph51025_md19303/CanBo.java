package xuongoop_ph51025_md19303;

public class CanBo {
    // Thuộc tính
    private int maNV;
    private String hoTen;
    private double thue;
    private double luong;

    // Constructor
    public CanBo(int maNV, String hoTen, double thue, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.thue = thue;
        this.luong = luong;
    }

    // Phương thức tính lương
    public float Tinh_Thue() {
    if (luong <= 9000000) {
        return 0;
    } else if (luong <= 15000000) {
        return (float) (0.1 * (luong - 9000000));
    } else {
        return (float) (0.1 * (15000000 - 9000000) + 0.12 * (luong - 15000000));
    }
}

    public float Tinh_Luong() {
        return (float) (luong - Tinh_Thue());
    }

    // Phương thức nhập thông tin cán bộ
    public void Nhap(int maNV, String hoTen, double thue, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.thue = thue;
        this.luong = luong;
    }

    // Phương thức xuất thông tin cán bộ
    public void Xuat() {
        System.out.println("Mã số: " + maNV);
        System.out.println("Họ và tên: " + hoTen);       
        System.out.println("Lương : " + Tinh_Luong());
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}


    



    
    
    

