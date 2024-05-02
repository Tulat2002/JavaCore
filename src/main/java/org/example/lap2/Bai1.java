package org.example.lap2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao bien a : ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao bien b : ");
        int b = scanner.nextInt();

        System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0 \n", a, b);

        if (a == 0 && b == 0){
            System.out.println("Phuong trinh vo so nghiem.");
        }else if (a == 0 && b != 0){
            System.out.println("Phuong trinh vo nghiem.");
        }else {
            float x = (float) -b/a ;
            System.out.printf("Phuong trinh co nghiem = %.3f", x);
        }
        scanner.close();
    }

}
