package com.company;

public  class NhanVien {
    public static  String name;
    public String gioiTinh;
    public int age;
    public int phoneNumber;
    public double Luong;

    public NhanVien(String name, String gioiTinh, int age, int phoneNumber, double luong) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.age = age;
        this.phoneNumber = phoneNumber;
        Luong = luong;
    }

    public NhanVien(){
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(int luong) {
        Luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", Luong=" + Luong +
                '}';
    }
}
