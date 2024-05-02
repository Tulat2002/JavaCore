package org.example.lap5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();


        while (true){
            System.out.println("Moi ban nhap so : ");
            double input = scanner.nextDouble();
            list.add(input);
            scanner.nextLine();
            System.out.println("Nhap them so : Y or N");
            String option = scanner.nextLine();
            if (option.equals("N") || option.equals("n")){
                break;
            }
        }

        System.out.println("Check array " + list);
        double sum = 0;

        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }

        System.out.println("Tong ArrayList la : " + sum);

    }

}
