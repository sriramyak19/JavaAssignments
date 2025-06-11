public class SwapFourWithoutTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        a = a + b + c + d; // a = 50
        b = a - (b + c + d); // b = 5
        c = a - (b + c + d); // c = 10
        d = a - (b + c + d); // d = 15
        a = a - (b + c + d); // a = 20

        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}

