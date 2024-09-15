package _08_OOP.Bai2;

public class TapChi extends TaiLieu {
    private String soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTL, String tenNXB, int soBanPhatHanh, String soPhatHanh, int thangPhatHanh) {
        super(maTL, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" + super.toString() + ", soPhatHanh='" + soPhatHanh + '\'' + ", thangPhatHanh=" + thangPhatHanh + '}';
    }
}