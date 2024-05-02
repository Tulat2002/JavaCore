package org.example.lap1;

import java.util.Scanner;

public class Bai01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ten sinh vien : ");

        String name = scanner.nextLine();

        System.out.println("nhap diem trung binh : ");

        double dtb = scanner.nextDouble();

        System.out.println(name + "co diem la : " + dtb);
        scanner.close();

    }

}
