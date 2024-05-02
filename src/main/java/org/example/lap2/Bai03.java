package org.example.lap2;

import java.util.Scanner;

public class Bai03 {

    public static void main(String[] args) {
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

}
