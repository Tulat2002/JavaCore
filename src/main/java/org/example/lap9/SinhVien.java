package org.example.lap9;

public class SinhVien {

    private int msv;
    private String name;
    private double diem;
    private int age;

    @Override
    public String toString() {
        return "SinhVien{" +
                "msv='" + msv + '\'' +
                ", name='" + name + '\'' +
                ", diem=" + diem +
                ", age=" + age +
                '}';
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SinhVien(int msv, String name, double diem, int age) {
        this.msv = msv;
        this.name = name;
        this.diem = diem;
        this.age = age;
    }
}
