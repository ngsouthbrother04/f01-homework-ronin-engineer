package _07_Overview_OOP;

public class SinhVien {
    private String hoTen, dc, email, sdt, MSSV;

    public SinhVien() {}

    public SinhVien(String hoTen, String dc, String email, String sdt, String MSSV) {
        this.hoTen = hoTen;
        this.dc = dc;
        this.email = email;
        this.sdt = sdt;
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void diHoc() {
        System.out.println(this.toString() + " dang di hoc");
    }

    public void lamBT() {
        System.out.println(this.toString() + " dang lam bai tap");
    }

    public void nopHP() {
        System.out.println(this.toString() + " dong hoc phi");

    }

    public void lamBaiThi() {
        System.out.println(this.toString() + " lam bai thi");
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", dc='" + dc + '\'' +
                ", email='" + email + '\'' +
                ", sdt='" + sdt + '\'' +
                ", MSSV='" + MSSV + '\'' +
                '}';
    }
}
