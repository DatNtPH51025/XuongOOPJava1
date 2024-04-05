package PhoTruongPhong;




import PhoTruongPhong.MenuPhoTP;
import java.util.Scanner;

public class PhoTPChucNang {
 
    
    public static void main(String[] args) {
            MenuPhoTP phoTP = new MenuPhoTP();
           Scanner scanner = new Scanner(System.in);
           
        while(true) {
            System.out.println("+================= Menu Phó Trưởng Phòng: =================+");
            System.out.println("1.Thêm Nhân Viên Vào Ban");
            System.out.println("2.Tìm Kiếm Nhân Viên");
            System.out.println("3.Hiển Thị Danh Sách Nhân Viên");
            System.out.println("4.Sắp xếp nhân viên");
            System.out.println("5.Hiển Thị Theo Thu Nhập");
            System.out.println("6.Xóa Nhân Viên Ra Khỏi Phòng Ban");
            System.out.println("7.Hiển Thị Theo Tên");
            System.out.println("8.Thêm 1 Phòng Ban Mới");
            System.out.println("9.Hiển Thị Tất Cả Phòng Ban");
            System.out.println("10.Xóa Tất Cả Nhân Viên");
            System.out.println("0.Thoát");
           System.out.println("+================******************=================+");
            System.out.print("Mời Phó Trưởng Phòng Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch(choice) {
                     case 1:
                    phoTP.themNhanVien();
                    break;
                case 2:
                    phoTP.timKiemNhanVien();
                    break;
                case 3:
                    phoTP.hienThiDanhSachNhanVien();
                    break;
                case 4:
                    phoTP.sapXepNhanVien();
                    break;
                case 5:
                    phoTP.hienThiTheoThuNhap();
                    break;
                case 6:
                    phoTP.xoaNhanVienRaKhoiPhongBan();
                    break;
                case 7:
                    phoTP.hienThiTheoTen();
                    break;
                case 8:
                    phoTP.themPhongBanMoi();
                    break;
                case 9:
                    phoTP.hienThiTatCaPhongBan();
                    break;
                case 10:
                    phoTP.xoaTatCaNhanVien();
                    break;
                case 0:
                    System.out.println("Hẹn Gặp Phó Trưởng Phòng Lần Sau ạ!...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có chức năng số " +choice + " trong menu vui lòng chọn lại!");
                    break;
            }
        }
    }
}
