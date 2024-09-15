package _08_OOP.Bai2;

public class Bao extends TaiLieu {
    private int ngayPhatHanh;

    public Bao(String maTL, String tenNXB, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTL, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString() + ", ngayPhatHanh=" + ngayPhatHanh + '}';
    }
}