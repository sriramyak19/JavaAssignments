public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    void printCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.printArea();
        circle.printCircumference();
    }
}

