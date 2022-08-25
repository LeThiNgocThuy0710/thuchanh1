package Bai4;
import java.util.Scanner;
public class TestSinhVien {
	public static void main(String[] args) {
        
        SinhVien sv1 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên 1: ");
        sv1.setMsSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 1: ");
        sv1.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv1.setDlt(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv1.setDth(sc.nextFloat());

        System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
        sv1.inSV();
       
    }
}
