package _08_OOP.Bai04;

import java.util.*;

public class QuanLyTuyenSinh implements QL {
    ArrayList<ConNguoi> list;

    @Override
    public void them(ConNguoi c) {
        if(list == null) list = new ArrayList<ConNguoi>();
        list.add(c);
    }

    @Override
    public void xoa(String sdt) {
        int idx = -1;
        for(int i = 0; i < list.size(); ++i) {
            if(list.get(i).getPhone().equalsIgnoreCase(sdt)) idx = i;
        }

        if(idx != -1) list.remove(idx);
        else System.out.println("Khong tim thay so dien thoai can xoa");
    }

    @Override
    public void hienThiDanhSach() {
        for(int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i).toString());
        }
    }

    public void menu() {
        while(true) {
            System.out.println("-----------------------------");
            System.out.println("1. Them");
            System.out.println("2. Xoa");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Thoat");
            System.out.println("-----------------------------");

            Scanner sc = new Scanner(System.in);
            int c = Integer.parseInt(sc.nextLine());

            if(c == 1) {
                while(true) {
                    System.out.print("Nhap ho ten: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhap ngay thang nam sinhh (dd/mm/yyyy): ");
                    String dob = sc.nextLine();
                    System.out.print("Nhap gioi tinh: ");
                    String gt = sc.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    String sdt = sc.nextLine();
                    System.out.print("Nhap ten truong da hoc: ");
                    String uni = sc.nextLine();
                    System.out.print("Nhap xep loai hoc tap (Gioi hoac Trung binh): ");
                    String xl = sc.nextLine();

                    if(xl.equalsIgnoreCase("gioi")) {
                        System.out.print("Nhap gpa: ");
                        double gpa = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhap ten giai thuong da co: ");
                        String giaiThuong = sc.nextLine();

                        this.them(new GoodStudent(hoTen, dob, gt, sdt, uni, xl, gpa, giaiThuong));
                        break;
                    }
                    else if(xl.equalsIgnoreCase("trung binh")) {
                        System.out.print("Nhap diem TOEIC: ");
                        int toeic = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhap diem thi dau vao: ");
                        double entryScore = Double.parseDouble(sc.nextLine());

                        this.them(new NormailStudent(hoTen, dob, gt, sdt, uni, xl, toeic, entryScore));
                        break;
                    }
                    else System.out.println("Vui long nhap dung thong tin");
                }
            }
            else if(c == 2) {
                System.out.print("Nhap so dien thoai can xoa thong tin: ");
                String sdt = sc.nextLine();

                this.xoa(sdt);
            }
            else if(c == 3) {
                System.out.println("-----------------------------------DANH SACH UNG VIEN----------------------------------------");
                this.hienThiDanhSach();
                System.out.println("---------------------------------------------------------------------------------------------");
            }
            else if(c == 4) break;
            else System.out.println("VUI LONG NHAP DUNG LUA CHON TRONG MENU");
        }
    }
}