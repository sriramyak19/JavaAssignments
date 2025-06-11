public class SwapThreeWithTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);

        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
    }
}
