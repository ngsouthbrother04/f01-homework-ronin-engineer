package _08_OOP.Bai1;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString() + ", bac=" + bac + '}';
    }
}
