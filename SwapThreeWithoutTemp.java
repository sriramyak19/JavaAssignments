public class SwapThreeWithoutTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);

        a = a + b + c;  // a = 30
        b = a - (b + c); // b = 5
        c = a - (b + c); // c = 10
        a = a - (b + c); // a = 15

        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
    }
}

