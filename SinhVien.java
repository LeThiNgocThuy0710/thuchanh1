package Bai4;

public class SinhVien {
	private int msSV;
	private String hoTen;
	private float dlt;
	private float dth;
	
	public SinhVien() {
		msSV = 0;
		hoTen = "";
		dlt = 0;
		dth = 0;
	}

	public SinhVien(int msSV, String hoTen, float dlt, float dth) {
		this.msSV = msSV<0?0:msSV;
		this.hoTen = (hoTen.equals("")?"@":hoTen);
		this.dlt = (dlt<0 ||  dlt >10)?0:dlt;
		this.dth = (dth<0 || dth >10)?0:dth;
	}

	public int getMsSV() {
		return msSV;
	}

	public void setMsSV(int msSV) {
		this.msSV = msSV<0?0:msSV;
	}

	public String getHoTen() {
		return hoTen;
}

	public void setHoTen(String hoTen) {
		this.hoTen = (hoTen.equals("")?"@":hoTen);
	}

	public float getDlt() {
		return dlt;
	}

	public void setDlt(float dlt) {
		this.dlt = (dlt<0 ||  dlt >10)?0:dlt;
	}

	public float getDth() {
		return dth;
	}

	public void setDth(float dth) {
		this.dth = (dth<0 || dth >10)?0:dth;
	}
	public float tinhDiemTB() {
		return (dlt + dth)/2;
		    }
	@Override
	public String toString() {
		return "SinhVien [msSV=" + msSV + ", hoTen=" + hoTen + ", dlt=" + dlt + ", dth=" + dth + "]";
	}
	public void inSV() {
	System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", msSV, hoTen, dlt, dth, tinhDiemTB());
		   }
}
