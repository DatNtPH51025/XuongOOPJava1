
package GiamDoc;

import java.util.Scanner;

public class MenuGiamDoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiamDocChucNang tpcn = new GiamDocChucNang();
        while(true) {
            System.out.println("+================= Menu Giám Đốc: =================+");
            System.out.println("1.Tuyển Nhân Viên Mới");
            System.out.println("2.Hiển Thị Danh Sách Nhân Viên");
            System.out.println("3.Sa Thải Nhân Viên");
            System.out.println("4.Tính Lương Nhân Viên");
            System.out.println("5.Tính Thuế Nhân VIên");
            System.out.println("6.Tìm Kiếm Nhân Viên");
            System.out.println("7.Sắp Xếp Nhân Viên Theo Lương");
            System.out.println("8.Tính Lương Thưởng");
            System.out.println("9.Tính Lương Trách Nghiệm");
            System.out.println("10.Top 3 Nhân Viên Có Mức Lương Cao Nhất");
            System.out.println("0.Thoát Chức Năng");
            System.out.println("+================******************=================+");
            System.out.print("Xin Mời Sếp Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch(choice) {
                   case 1:
        tpcn.tuyenNhanVien();
        break;
    case 2:
        tpcn.hienThiNhanVien();
        break;
    case 3:
        tpcn.saThaiNhanVien();
        break;
    case 4: 
        tpcn.tinhLuongNhanVien();
        break;
    case 5:
        tpcn.tinhThueNhanVien();
        break;
    case 6:
        tpcn.timKiemNhanVien();
        break;
    case 7:
        tpcn.SapxepNhanVienTheoLuong();
        break;
    case 8:
     
        tpcn.TinhLuongThuong(10); // 10% bonus
        break;
    case 9:
        tpcn.tinhLuongTrachNghiem(5); // 5% responsibility
        break;
    case 10:
        tpcn.top3NV();
        break;
                case 0:
                    System.out.println("Thoát Thành Công!Hẹn Gặp Sếp Lần Sau!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có chức năng số "+choice + " xin mời xếp chọn lại");
                    break;
            }
        }
    }
}
