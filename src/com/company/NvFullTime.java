package com.company;

public class NvFullTime extends NhanVien {
    public int doanhThu;

    public NvFullTime(String name, String gioiTinh, int age, int phoneNumber, int luong) {
        super(name, gioiTinh, age, phoneNumber, luong);
    }

    public int doanhThu(int luong) {
        return  luong * 10;
    }

    public NvFullTime() {
        super();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getGioiTinh() {
        return super.getGioiTinh();
    }

    @Override
    public void setGioiTinh(String gioiTinh) {
        super.setGioiTinh(gioiTinh);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public double getLuong() {
        return super.getLuong();
    }

    @Override
    public void setLuong(int luong) {
        super.setLuong(luong);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
