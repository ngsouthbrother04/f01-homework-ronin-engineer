package _10_Exception.B10;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    ArrayList<SinhVien> list;

    public void them(SinhVien sv) {
        if(list == null) list = new ArrayList<SinhVien>();
        list.add(sv);
    }

    public void xoa(String mssv) throws EmptyStudentException {
        if(list == null) throw new EmptyStudentException("Danh sach sinh vien rong khong the xoa sinh vien");

        int idx = -1;
        for(int i = 0; i < list.size(); ++i) {
            if(list.get(i).getMssv().equalsIgnoreCase(mssv)) idx = i;
        }
        list.remove(idx);
    }

    public void hienThiDS() {
        for(SinhVien s : list) System.out.println(s.toString());
    }

    public void checkMSSV(String mssv) throws InvalidIDException {
        if(mssv.length() != 10) throw new InvalidIDException("Ma so sinh vien khong hop le");
    }

    public void menu() {
        while(true) {
            System.out.println("---------------------------------");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xoa sinh vien");
            System.out.println("3. Hien thi danh sach sinh vien");
            System.out.println("4. Thoat");
            System.out.println("---------------------------------");

            Scanner sc = new Scanner(System.in);

            int c = Integer.parseInt(sc.nextLine());
            if(c == 1) {
                try {
                    System.out.print("Nhap ho ten: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap MSSV: ");
                    String mssv = sc.nextLine();
                    System.out.print("Nhap lop: ");
                    String lop = sc.nextLine();

                    this.checkMSSV(mssv);
                    this.them(new SinhVien(mssv, ten, lop));
                } catch(InvalidIDException e) {
                    System.err.println(e);
                }
            }
            else if(c == 2) {
                try {
                    System.out.print("Nhap ma so sinh vien can xoa: ");
                    String mssv = sc.nextLine();

                    this.checkMSSV(mssv);
                    this.xoa(mssv);
                } catch (EmptyStudentException | InvalidIDException e) {
                    System.err.println(e);
                }
            }
            else if(c == 3) {
                this.hienThiDS();
            }
            else if(c == 4) break;
        }
    }
}
