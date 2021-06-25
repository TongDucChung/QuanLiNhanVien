package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Manager {
    static ArrayList<NhanVien> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addNv(int choise) {
        NhanVien nhanVien;
        if (choise == 1)
            nhanVien = taoNhanVienFullTime();
        else
            nhanVien = taoNhanVienPartTime();

        list.add(nhanVien);
    }

    private static NvFullTime taoNhanVienFullTime() {
        System.out.println("Nhap ten nhan vien Full Time");
        String name = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhap tuoi nhan vien Full Time");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap sdt nhan vien Full Time");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap luong nhan vien Full Time");
        int luong = Integer.parseInt(scanner.nextLine());

        NvFullTime nvFullTime = new NvFullTime(name, gioiTinh, age, phoneNumber, luong);
        return nvFullTime;
    }

    public static NVPartTime taoNhanVienPartTime() {
        System.out.println("Nhap ten nhan vien Part Time");
        String name = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhap tuoi nhan vien Part Time");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap sdt nhan vien Part Time");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap luong nhan vien Part Time");
        int luong = Integer.parseInt(scanner.nextLine());

        NVPartTime nvPartTime = new NVPartTime(name, gioiTinh, age, phoneNumber, luong);
        return nvPartTime;
    }

    public static void removeByName(){
        System.out.println("Nhap ten can xoa");
        String name=scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name))
                list.remove(name);
        }
        }
        public static void sortByAge(){
        SortByAge sortByAge = new SortByAge();
            Collections.sort(list,sortByAge);
        }
    }



