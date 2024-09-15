package _08_OOP.Bai1;

import java.util.Objects;

public class CanBo {
    private String ten;
    private int tuoi;
    private String gioiTinh, diaChi;

    public CanBo(String ten, int tuoi, String gioiTinh, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CanBo canBo = (CanBo)o;
        return Objects.equals(ten, canBo.ten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ten, tuoi, gioiTinh, diaChi);
    }

    @Override
    public String toString() {
        return "Ten: " + ten + " , Tuoi: " + tuoi + " , gioi tinh: " + gioiTinh + " , dia chi: " + diaChi + " ";
    }
}
