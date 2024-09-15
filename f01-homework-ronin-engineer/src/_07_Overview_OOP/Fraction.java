package _07_Overview_OOP;

public class Fraction {
    private int tu, mau;
    private boolean valid;

    public Fraction() {

    }

    public Fraction(int tu, int mau) {
        this.tu = tu;
        if(mau != 0) {
            valid = true;
            this.mau = mau;
        }
        else valid = false;
    }

    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public void rutGon() {
        int rutGon = gcd(tu, mau);
        this.tu /= rutGon;
        this.mau /= rutGon;
    }

    public Fraction cong(Fraction f) {
        if(!valid) {
            System.out.println("Error");
            return null;
        }
        else {
            int t = this.tu * f.mau + f.tu * this.mau;
            int m = this.mau * f.mau;

            Fraction res = new Fraction(t, m);
            res.rutGon();
            return res;
        }
    }

    public Fraction tru(Fraction f) {
        if(!valid) {
            System.out.println("Error");
            return null;
        }
        else {
            int t = this.tu * f.mau - f.tu * this.mau;
            int m = this.mau * f.mau;

            Fraction res = new Fraction(t, m);
            res.rutGon();
            return res;
        }
    }

    public Fraction nhan(Fraction f) {
        if(!valid) {
            System.out.println("Error");
            return null;
        }
        else {
            int t = this.tu * f.tu;
            int m = this.mau * f.mau;
            Fraction res = new Fraction(t, m);
            res.rutGon();
            return res;
        }
    }

    public Fraction chia(Fraction f) {
        if(!valid) {
            System.out.println("Error");
            return null;
        }
        else {
            int t = this.tu * f.mau;
            int m = this.mau * f.tu;

            if(t==0) return new Fraction(0,1);

            Fraction res = new Fraction(t, m);
            res.rutGon();
            return res;
        }
    }
}
