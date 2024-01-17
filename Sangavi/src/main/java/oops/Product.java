package oops;

public class Product {
    double price;

    double getPrice() {
        return price;
    }

    void setPrice(double myPrice) {
        price = myPrice;
    }

    double getPrice(int quantity){
        return quantity*price;
    }

    void printType() {
        System.out.println("It is a Product");
    }
}

class Phone extends Product{
    @Override
    void printType() {
        System.out.println("It is a Phone");
    }
}