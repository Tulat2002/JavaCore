package org.example.lap1;

import java.util.Scanner;

public class Bai03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh hinh lap phuong : ");
        int canh = scanner.nextInt();
        double theTich = Math.pow(canh, 3);
        System.out.println("The tich = " + theTich);
        scanner.close();
    }

}
