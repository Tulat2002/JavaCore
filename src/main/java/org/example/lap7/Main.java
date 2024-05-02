package org.example.lap7;

public class Main {

    public static void main(String[] args) {
        SinhVien sinhVienIT = new SinhVienIT(10,9);

        System.out.println("Sinh vien IT : " + sinhVienIT.getDiem());

        SinhVien sinhVienCoKhi = new SinhVienCoKhi(8,9);

        System.out.println("Sinh vien IT : " + sinhVienCoKhi.getDiem());
    }

}
