package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Quan li nhan vien");
            System.out.println("1.Them Nhan Vien");
            System.out.println("2. Xoa Nhan Vien Theo Ten");
            System.out.println("3. Sap xem Nhan vien theo tuoi");
            int choise=scanner.nextInt();
            switch (choise){
                case 1:
                    System.out.println("Nhap vao kieu nhan vien muon them");
                    System.out.println("1. them nhan vien FullTime");
                    System.out.println("2. them nhan vien PartTime");
                    int choise2= scanner.nextInt();
                    Manager.addNv(choise2);
                case 2:
                    System.out.println("Nhap vao nhan vien muon xoa");
                    int choise3=scanner.nextInt();
                    Manager.removeByName();
                case 3:
                    System.out.println("Nhap vao tuoi ");
                    int choise4=scanner.nextInt();
                    Manager.sortByAge();
            }
        }
    }
}
