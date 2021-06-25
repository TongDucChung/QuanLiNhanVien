package com.company;

public class NVPartTime extends NhanVien{
    public int soGio;
    public int doanhThu;

    public NVPartTime(String name, String gioiTinh, int age, int phoneNumber, int luong,int soGio) {
        this.soGio=soGio;
        super(name, gioiTinh, age, phoneNumber, luong);
    }

    public NVPartTime() {
        super();
    }
    public double doanhThu(){
        return getLuong()*soGio;
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
