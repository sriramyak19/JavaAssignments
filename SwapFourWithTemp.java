public class SwapFourWithTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}

