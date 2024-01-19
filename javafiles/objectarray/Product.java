public class Product implements Comparable<Product> {
    private int id;
    private double weight;
    private double price;


    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }


    public static void main(String[] args) {
        Product product1 = new Product(1, 0.5, 20.0);
        Product product2 = new Product(2, 1.0, 15.0);

        int result = product1.compareTo(product2);

        if (result < 0) {
            System.out.println("Product 1 is cheaper than Product 2");
        } else if (result > 0) {
            System.out.println("Product 1 is more expensive than Product 2");
        } else {
            System.out.println("Product 1 and Product 2 have the same price");
        }
    }
}
