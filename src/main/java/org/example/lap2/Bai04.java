package org.example.lap2;

import java.util.Scanner;

public class Bai04 {

    public static void bai01(){
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");

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

    public static void bai02(){
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vap bien a : ");
        int a = scanner.nextInt();
        System.out.println("Nhap vap bien b : ");
        int b = scanner.nextInt();
        System.out.println("Nhap vap bien c : ");
        int c = scanner.nextInt();

        System.out.printf("Giai phuong trinh bac hai %dx^2 + %dx + %d = 0 \n", a, b, c);

        if (a == 0){
           // giaiPhuongTrinhBacNhat(b, c);
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

    public static void bai03(){
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao so dien");
        int soDien = scanner.nextInt();

        if (soDien >=0 || soDien <= 100){
            int soTien = soDien * 1000;
            System.out.println(soTien);
        }else if (soDien >= 100){
            int tong = 100 * 1000 + (soDien -100) * 1500;
            System.out.println(tong);
        }else {
            System.out.println("Ban nahp sai");
        }
        scanner.close();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai  |");
        System.out.println("| 3. Tính số tiền điện          |");
        System.out.println("| 4. Kết thúc                   |");
        System.out.println("++ ----------------------------- ++");

        System.out.println("Moi nhap lua chon cua ban : ");
        int x = scanner.nextInt();

        switch (x){
            case 1:
                bai01();
                break;
            case 2:
                bai02();
                break;
            case 3:
                bai03();
                break;
            default:
                System.out.println(">> Ban da thoat truong trinh <<");
                System.exit(0);
        }

    }

}
