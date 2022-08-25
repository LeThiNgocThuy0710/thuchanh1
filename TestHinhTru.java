package Bai3;
import java.util.Scanner;

public class TestHinhTru {
	public static double DtXungQuanh(double r, double h) {
		return 3.14*2*r*h;
	}
	public static double DtToanPhan(double r, double h) {
		return 3.14*2*r*(r+h);
	}
	public static double TheTich(double r, double h) {
		return 3.14*r*r*h;
	}

	
	public static void main (String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ban kinh hinh tru: ");
		double r = scanner.nextDouble();
		System.out.println("Nhap chieu cao hinh tru: ");
		double h = scanner.nextDouble();	
        System.out.println("Dien tich xung quanh hinh tru: "+DtXungQuanh(r,h));	
        System.out.println("Dien tich toan phan hinh tru: "+DtToanPhan(r,h));	
        System.out.println("the tich hinh tru: "+TheTich(r,h));	
	}
}
