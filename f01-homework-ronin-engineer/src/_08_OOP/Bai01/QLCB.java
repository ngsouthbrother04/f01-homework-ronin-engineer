package _08_OOP.Bai01;

import java.util.*;

public class QLCB implements _08_OOP.Bai01.ChucNang {
    ArrayList<_08_OOP.Bai01.CanBo> ar;

    @Override
    public void timKiem(String ten) {
        for(int i = 0; i < ar.size(); ++i) {
            if(ar.get(i).getTen().equals(ten)) {
                System.out.println(ar.get(i).toString());
            }
        }
    }

    @Override
    public void them(CanBo a) {
        if(this.ar == null) ar = new ArrayList<CanBo>();
        ar.add(a);
    }

    @Override
    public void show() {
        for(CanBo x : ar) {
            System.out.println(x.toString());
        }
    }

    public void Menu() {
        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("-----------------------------------------------");
            System.out.println("1. Them can bo");
            System.out.println("2. Tim kiem theo ten can bo");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Thoat");
            System.out.println("-----------------------------------------------");

            int choice = Integer.parseInt(sc.nextLine());

            if(choice == 1) {
                while(true) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("1. Ky su");
                    System.out.println("2. Nhan vien");
                    System.out.println("3. Cong nhan");
                    System.out.println("4. Thoat");
                    System.out.println("-----------------------------------------------");

                    int t = Integer.parseInt(sc.nextLine());

                    if(t == 1) {
                        System.out.print("Nhap ten: ");
                        String ten = sc.nextLine();
                        System.out.print("Nhap tuoi: ");
                        int tuoi  = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap gioi tinh: ");
                        String gt = sc.nextLine();
                        System.out.print("Nhap dia chi: ");
                        String dc = sc.nextLine();
                        System.out.print("Nhap nganh: ");
                        String nganh = sc.nextLine();

                        CanBo c = new KySu(ten, tuoi, gt, dc, nganh);
                        this.them(c);
                    }
                    else if(t == 2) {
                        System.out.print("Nhap ten: ");
                        String ten = sc.nextLine();
                        System.out.print("Nhap tuoi: ");
                        int tuoi  = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap gioi tinh: ");
                        String gt = sc.nextLine();
                        System.out.print("Nhap dia chi: ");
                        String dc = sc.nextLine();
                        System.out.print("Nhap cong viec: ");
                        String cv = sc.nextLine();

                        CanBo c = new NhanVien(ten, tuoi, gt, dc, cv);
                        this.them(c);
                    }
                    else if(t == 3) {
                        System.out.print("Nhap ten: ");
                        String ten = sc.nextLine();
                        System.out.print("Nhap tuoi: ");
                        int tuoi  = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap gioi tinh: ");
                        String gt = sc.nextLine();
                        System.out.print("Nhap dia chi: ");
                        String dc = sc.nextLine();
                        System.out.print("Nhap bac cua cong nhan (tu 1 -> 10): ");
                        int bac = Integer.parseInt(sc.nextLine());

                        CanBo c = new CongNhan(ten, tuoi, gt, dc, bac);
                        this.them(c);
                    }
                    else if(t == 4) break;
                    else {
                        System.out.println("Vui long nhap dung lua chon trong menu");
                    }
                }
            }
            else if(choice == 2) {
                System.out.print("Nhap ten can bo can tim: ");
                String tenCB = sc.nextLine();
                this.timKiem(tenCB);
            }
            else if(choice == 3) {
                this.show();
            }
            else if(choice == 4) break;
            else {
                System.out.println("Vui long nhap dung lua chon trong menu");
            }
        }
    }
}