package Bai2;

public class Point {
	private String ten;
	private int x;
	private int y;
	private int z;
	
	
	public Point(String ten, int x, int y, int z) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Point negate() {
		Point b = new Point ("~"+ten, -x, -y, -z);
		return b;
	}
	public Double getDistance() {
		return Math.sqrt(x*x+y*y+z*z);
	}

	@Override
	public String toString() {
		return "Point [ten=" + ten + ", x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
