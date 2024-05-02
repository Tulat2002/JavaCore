package org.example.lap1;

import java.util.Scanner;

public class Bai02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong hinh chu nhat : ");
        int chieuRong = scanner.nextInt();
        System.out.println("Nhap vao chieu dai hinh chu nhat : ");
        int chieuDai = scanner.nextInt();
        int chuVi =(chieuDai + chieuRong) * 2;
        int dienTich = chieuDai * chieuRong;
        int canhMin = Math.min(chieuDai, chieuRong);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien Tich: " + dienTich);
        System.out.println("Canh Min: " + canhMin);
        scanner.close();
    }

}
