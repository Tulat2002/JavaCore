package org.example.lap6;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao username");
        String username = scanner.nextLine();
        System.out.println("Moi nhap vao password");
        String password = scanner.nextLine();
        if (username.equals("AnkTu") && password.length() > 6){
            System.out.println("Username : " + username +  " Password : " + password);
        }

        //System.out.println("Username : " + username +  " Password : " + password);
        System.out.println("Ban da nhap sai");
        scanner.close();
    }

}
