public class Calculator {
    public int add(int a, int b) {
        int sum = a + b; // local variable
        return sum;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println("Sum is: " + result);
    }
}


