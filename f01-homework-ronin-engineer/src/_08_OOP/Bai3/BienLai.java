package _08_OOP.Bai3;

public class BienLai {
    private HoGiaDinh chuHo;
    private double csCu, csMoi, tongTienPhaiTra;

    public BienLai(HoGiaDinh chuHo, double csCu, double csMoi, double tongTienPhaiTra) {
        this.chuHo = chuHo;
        this.csCu = csCu;
        this.csMoi = csMoi;
        this.tongTienPhaiTra = tongTienPhaiTra;
    }

    public HoGiaDinh getChuHo() {
        return chuHo;
    }

    public void setChuHo(HoGiaDinh chuHo) {
        this.chuHo = chuHo;
    }

    public double getCsCu() {
        return csCu;
    }

    public void setCsCu(double csCu) {
        this.csCu = csCu;
    }

    public double getCsMoi() {
        return csMoi;
    }

    public void setCsMoi(double csMoi) {
        this.csMoi = csMoi;
    }

    public double getTongTienPhaiTra() {
        return tongTienPhaiTra;
    }

    public void setTongTienPhaiTra(double tongTienPhaiTra) {
        this.tongTienPhaiTra = tongTienPhaiTra;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "chuHo=" + chuHo +
                ", csCu=" + csCu +
                ", csMoi=" + csMoi +
                ", tongTienPhaiTra=" + tongTienPhaiTra +
                '}';
    }
}