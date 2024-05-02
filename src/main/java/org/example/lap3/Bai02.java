package org.example.lap3;

import java.util.Scanner;

public class Bai02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so : ");
        int x = scanner.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.printf(" %d x %d = %d", x, i, x * i);
            System.out.println();
        }
        scanner.close();
    }

}
