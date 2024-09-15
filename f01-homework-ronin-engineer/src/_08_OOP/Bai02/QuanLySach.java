package _08_OOP.Bai02;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach implements ChucNang {
    ArrayList<TaiLieu> ar;

    @Override
    public void them(TaiLieu t) {
        if(ar == null) ar = new ArrayList<TaiLieu>();
        ar.add(t);
    }

    @Override
    public void xoa(String ma) {
        for(int i = 0; i < ar.size(); ++i) {
            if(ar.get(i).getMaTL().equals(ma)) {
                ar.remove(i);
            }
        }
    }

    @Override
    public void show() {
        for(int i = 0; i < ar.size(); ++i) {
            System.out.println(ar.get(i).toString());
        }
    }

    @Override
    public void timKiem(String loai) {
        if(loai.equalsIgnoreCase("bao")) {
            for(int i = 0; i < ar.size(); ++i) {
                if(ar.get(i) instanceof Bao) System.out.println(ar.get(i).toString());
            }
        }
        if(loai.equalsIgnoreCase("sach")) {
            for(int i = 0; i < ar.size(); ++i) {
                if(ar.get(i) instanceof Sach) System.out.println(ar.get(i).toString());
            }
        }
        if(loai.equalsIgnoreCase("tap chi")) {
            for(int i = 0; i < ar.size(); ++i) {
                if(ar.get(i) instanceof TapChi) System.out.println(ar.get(i).toString());
            }
        }
    }

    public void menu() {
        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("-----------------------------------------");
            System.out.println("1. Them tai lieu");
            System.out.println("2. Xoa tai lieu theo ma tai lieu");
            System.out.println("3. Hien thi thong tin tai lieu");
            System.out.println("4. Tim kiem theo loai");
            System.out.println("5. Thoat");
            System.out.println("-----------------------------------------");

            int c = Integer.parseInt(sc.nextLine());
            if(c == 1) {
                while(true) {
                    System.out.println("-----------------------------------------");
                    System.out.println("1. Sach");
                    System.out.println("2. Tap chi");
                    System.out.println("3. Bao");
                    System.out.println("4. Thoat");
                    System.out.println("-----------------------------------------");

                    int t = Integer.parseInt(sc.nextLine());
                    if(t == 1) {
                        System.out.print("Nhap ma tai lieu: ");
                        String maTL = sc.nextLine();
                        System.out.print("Nhap ten NXB: ");
                        String tenNXB = sc.nextLine();
                        System.out.print("Nhap so ban muon phat hanh: ");
                        int soBanPhatHanh = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap ten tac gia: ");
                        String tenTG = sc.nextLine();
                        System.out.print("Nhap so trang: ");
                        int soTrang = Integer.parseInt(sc.nextLine());

                        TaiLieu a = new Sach(maTL, tenNXB, soBanPhatHanh, tenTG, soTrang);
                        this.them(a);
                    }
                    else if(t == 2) {
                        System.out.print("Nhap ma tai lieu: ");
                        String maTL = sc.nextLine();
                        System.out.print("Nhap ten NXB: ");
                        String tenNXB = sc.nextLine();
                        System.out.print("Nhap so ban muon phat hanh: ");
                        int soBanPhatHanh = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap so phat hanh: ");
                        String soPhatHanh = sc.nextLine();
                        System.out.print("Nhap thang phat hanh: ");
                        int thangPhatHanh = Integer.parseInt(sc.nextLine());

                        TaiLieu a = new TapChi(maTL, tenNXB, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                        this.them(a);
                    }
                    else if(t == 3) {
                        System.out.print("Nhap ma tai lieu: ");
                        String maTL = sc.nextLine();
                        System.out.print("Nhap ten NXB: ");
                        String tenNXB = sc.nextLine();
                        System.out.print("Nhap so ban muon phat hanh: ");
                        int soBanPhatHanh = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap so ngay phat hanh: ");
                        int ngayPhatHanh = Integer.parseInt(sc.nextLine());

                        TaiLieu a = new Bao(maTL, tenNXB, soBanPhatHanh, ngayPhatHanh);
                        this.them(a);
                    }
                    else if(t == 4) break;
                    else {
                        System.out.println("Vui long nhap dung lua chon");
                    }
                }
            }
            else if(c == 2) {
                System.out.print("Nhap ma tai lieu can xoa: ");
                String ma = sc.nextLine();

                this.xoa(ma);
            }
            else if(c == 3) {
                this.show();
            }
            else if(c == 4) {
                System.out.print("Nhap loai tai lieu can tim kiem (Sach, Bao, Tap chi): ");
                String s =  sc.nextLine();

                this.timKiem(s);
            }
            else if(c == 5) break;
            else {
                System.out.println("Vui long nhap dung lua chon");
            }
        }
    }
}