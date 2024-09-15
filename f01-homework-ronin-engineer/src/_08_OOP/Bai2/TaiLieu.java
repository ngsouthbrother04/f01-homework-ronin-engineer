package _08_OOP.Bai2;

public class TaiLieu {
    private String maTL, tenNXB;
    private int soBanPhatHanh;

    public TaiLieu(String maTL, String tenNXB, int soBanPhatHanh) {
        this.maTL = maTL;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "MaTL: " + maTL + " , Ten NXB: " + tenNXB + " , so ban phat hanh: " + soBanPhatHanh + " ";
    }
}