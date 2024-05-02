package org.example.lap4;

public class Product {

    private String name;

    private double price;

    private double tax;

    public Product(){

    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Product nhapThongTin(String name, double price, double tax){
        Product product = new Product(name, price, tax);
//        product.setName(name);
//        product.setPrice(price);
//        product.setTax(tax);
        return product;
    }

    public void xuatThongTin(Product product){
        //System.out.println(product);
        System.out.println("name : "+ product.getName() + " " + "price " + product.getPrice() + " " + "tax" + product.getTax());
    }

    public double getPriceTax(double price, double tax){
        return price * tax;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
