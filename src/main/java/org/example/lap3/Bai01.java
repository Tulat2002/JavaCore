package org.example.lap3;

import java.util.Scanner;

public class Bai01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap vao mot so nguyen: ");
        int value = scanner.nextInt();

        int count = 0;
        for (int i = 2; i <= value; i++){
            if (value % i == 0){
                System.out.println("Uoc so khac " + i);
                count ++ ;
                break;
            }
        }
        if (count == 0){
            System.out.printf("%d la so nguyen to : ", value);
        }else {
            System.out.printf("%d khong la so nguyen to : ", value);
        }
        scanner.close();
    }

}
