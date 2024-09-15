public class Bai9 {
    public static void main(String[] args) {
        int giay = 365 * 24 * 60 * 60;
        long ds = 312032486;

        int dsSinh = giay/7;
        int dsTu = giay/13;
        int dsNhapCu = giay/45;
        long dsTang = (long)dsSinh + dsNhapCu - dsTu;

        System.out.println("Dan so nam 1: " + ds + dsTang);
        System.out.println("Dan so nam 2: " + ds + dsTang * 2);
        System.out.println("Dan so nam 3: " + ds + dsTang * 3);
        System.out.println("Dan so nam 4: " + ds + dsTang * 4);
        System.out.println("Dan so nam 5: " + ds + dsTang * 5);
    }
}
