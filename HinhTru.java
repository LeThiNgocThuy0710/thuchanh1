package Bai3;

public class HinhTru {
	private double r;
	private double h;
	
	public HinhTru(double r, double h) {
		super();
		this.r = r;
		this.h = h;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return "HinhTru [r=" + r + ", h=" + h + "]";
	}
	
}
