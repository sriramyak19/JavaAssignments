public class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void calculateDiscount(double discountPercent) {
        double discountAmount = price * discountPercent / 100;
        double finalPrice = price - discountAmount;
        System.out.println("Discounted Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Mobile", 30000);
        p.calculateDiscount(10);
    }
}

