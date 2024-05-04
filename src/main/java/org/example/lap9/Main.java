package org.example.lap9;

import java.util.Scanner;

public class Main {

    public static int nhapMasv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma sinh vien: ");
        int result;
        while (true){
            try{
                result = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Ma sinh vien khong hop le , moi nhap vao chuoi string");
                scanner.next();
            }
        }
        scanner.close();
        return result;
    }

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){
            int mssv = nhapMasv();

            SinhVien sinhVien = new SinhVien(mssv, "Ank TU", 9.6, 10);
            System.out.println("ma so sinh vien : " + sinhVien);
        }

    }

}
