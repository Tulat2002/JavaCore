package org.example.lap2;

import org.example.Main;

import java.util.Scanner;

public class Bai02 {

    public static void giaiPhuongTrinhBacNhat(int a, int b){
        System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0 \n", a, b);

        if (a == 0 && b == 0){
            System.out.println("Phuong trinh vo so nghiem.");
        }else if (a == 0 && b != 0){
            System.out.println("Phuong trinh vo nghiem.");
        }else {
            float x = (float) -b/a ;
            System.out.printf("Phuong trinh co nghiem = %.3f", x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vap bien a : ");
        int a = scanner.nextInt();
        System.out.println("Nhap vap bien b : ");
        int b = scanner.nextInt();
        System.out.println("Nhap vap bien c : ");
        int c = scanner.nextInt();

        System.out.printf("Giai phuong trinh bac hai %dx^2 + %dx + %d = 0 \n", a, b, c);

        if (a == 0){
            giaiPhuongTrinhBacNhat(b, c);
        }else {
            int delta = b * b - 4 * a * c;
            if (delta > 0){
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.printf("Phuong trinh vo nghiem kep x =%.3f ", x);
            }else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.printf("Phuong trinh co 2 nghiem ring biet, x1 =%.3f, x2 =%.3f ", x1, x2);
            }
        }
        scanner.close();

    }

}
