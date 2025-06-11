public class Car {
    String model;
    double price;
    static int carCount = 0;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
        carCount++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 75000);
        Car c2 = new Car("BMW", 65000);
        System.out.println("Total Cars: " + Car.carCount);
    }
}

