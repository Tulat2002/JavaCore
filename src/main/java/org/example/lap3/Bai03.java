package org.example.lap3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang : ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.print("Nhap phan tu : ");
        for (int i = 0; i <size; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println("Array ban dau: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array sau khi sap xep : "+Arrays.toString(a));
        System.out.println(" max : " + a[a.length-1]);
        System.out.println(" min : " + a[0]);

    }

}
