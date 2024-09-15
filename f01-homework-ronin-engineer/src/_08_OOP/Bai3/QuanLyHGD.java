package _08_OOP.Bai3;

import java.util.*;

public class QuanLyHGD implements QLHGD {
    ArrayList<HoGiaDinh> listHGD;

    @Override
    public void them(HoGiaDinh hgd) {
        if(listHGD == null) listHGD = new ArrayList<HoGiaDinh>();
        listHGD.add(hgd);
    }

    @Override
    public void xoa(String maCongTo) {
        for(int i = 0; i < listHGD.size(); ++i) {
            if(listHGD.get(i).getMaSoCongToDien().equalsIgnoreCase(maCongTo)) listHGD.remove(i);
        }
    }

    @Override
    public void sua() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui long nhap lai thong tin ho gia dinh cũ");
        System.out.print("Nhap ho ten chu ho:  ");
        String ten = sc.nextLine();
        System.out.print("Nhap so nha:  ");
        String dc = sc.nextLine();
        System.out.print("Nhap ma cong to dien: ");
        String ma = sc.nextLine();

        int idx = listHGD.indexOf(new HoGiaDinh(ten, dc, ma));
        if(idx != -1)  {
            listHGD.remove(idx);

            System.out.println("Vui long nhap thong tin moi");
            System.out.print("Nhap ho ten chu ho:  ");
            String tenCH = sc.nextLine();
            System.out.print("Nhap so nha:  ");
            String sn = sc.nextLine();
            System.out.print("Nhap ma cong to dien: ");
            String maCTD = sc.nextLine();

            listHGD.add(new HoGiaDinh(tenCH, sn, maCTD));
        }
        else System.out.println("Khong co thong tin trung khop");
    }

    public void menu() {
        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("---------------------------------");
            System.out.println("1. Them");
            System.out.println("2. Xoa");
            System.out.println("3. Sua");
            System.out.println("---------------------------------");

            int c = Integer.parseInt(sc.nextLine());

            if(c == 1)  {
                System.out.print("Nhap ho ten chu ho: ");
                String chuHo = sc.nextLine();
                System.out.print("Nhap so nha: ");
                String soNha = sc.nextLine();
                System.out.print("Nhap ma cong to dien: ");
                String maCongToDien = sc.nextLine();

                HoGiaDinh a = new HoGiaDinh(chuHo, soNha, maCongToDien);
                this.them(a);
            }
            else if(c == 2) {
                System.out.print("Nhap ma cong to dien muon xoa: ");
                String ma = sc.nextLine();
                this.xoa(ma);
            }
            else if(c == 3) {
                this.sua();
            }
            else if(c == 4) break;
            else System.out.println("Vui long nhap dung lua chon co trong menu");
        }
    }
}