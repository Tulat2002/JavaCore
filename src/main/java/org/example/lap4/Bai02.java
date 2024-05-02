package org.example.lap4;

public class Bai02 {

    public static void main(String[] args) {
        Product product = new Product("Iphone", 1000, 903);
        Product product2 = new Product("SamSung", 999, 800);

        System.out.println(product);
        System.out.println(product2);

        Product test = new Product();
        Product pr = test.nhapThongTin("Computer", 12000, 98);
        test.xuatThongTin(pr);
        test.getPriceTax(pr.getPrice(), pr.getTax());
    }

}
