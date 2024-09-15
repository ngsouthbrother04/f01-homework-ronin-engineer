package _08_OOP.Bai3;

import java.util.*;

public class QuanLyBienLai {
    ArrayList<BienLai> listBL;

    public double tinhTienDien(double cu, double moi) {
        return (moi - cu) * 5;
    }

    public void themThongTinBienLai() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten chu ho: ");
        String ten = sc.nextLine();
        System.out.print("Nhap so nha: ");
        String sn = sc.nextLine();
        System.out.print("Nhap ma cong to dien: ");
        String ma = sc.nextLine();
        HoGiaDinh a = new HoGiaDinh(ten, sn, ma);

        System.out.print("Nhap chi so cu: ");
        double csCu = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap chi so moi: ");
        double csMoi = Double.parseDouble(sc.nextLine());
        double tongTien = this.tinhTienDien(csCu, csMoi);

        if(listBL == null) listBL = new ArrayList<BienLai>();
        listBL.add(new BienLai(a, csCu, csMoi, tongTien));
    }

    public void hienThiDanhSachBienLai() {
        for(BienLai bl : listBL) {
            System.out.println(bl.toString());
        }
    }
}