public class Operators {
    public static void main(String[] args) {

        // 1. Simple Arithmetic Operations
        int a = 10, b = 3;
        System.out.println("1. Simple Arithmetic Operations");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println();

        // 2. Increment and Decrement Operators
        int n = 5;
        System.out.println("2. Increment and Decrement Operators");
        System.out.println("Original: " + n);
        System.out.println("Pre-Increment: " + (++n));
        System.out.println("Post-Increment: " + (n++));
        System.out.println("After Post-Increment: " + n);
        System.out.println("Pre-Decrement: " + (--n));
        System.out.println("Post-Decrement: " + (n--));
        System.out.println("After Post-Decrement: " + n);
        System.out.println();

        // 3. Compound Assignment Operators
        int x = 10;
        System.out.println("3. Compound Assignment Operators");
        x += 5; System.out.println("x += 5: " + x);
        x -= 2; System.out.println("x -= 2: " + x);
        x *= 3; System.out.println("x *= 3: " + x);
        x /= 2; System.out.println("x /= 2: " + x);
        x %= 4; System.out.println("x %= 4: " + x);
        System.out.println();

        // 4. Relational Operators
        int r1 = 7, r2 = 5;
        System.out.println("4. Relational Operators");
        System.out.println("r1 == r2: " + (r1 == r2));
        System.out.println("r1 != r2: " + (r1 != r2));
        System.out.println("r1 > r2: " + (r1 > r2));
        System.out.println("r1 < r2: " + (r1 < r2));
        System.out.println("r1 >= r2: " + (r1 >= r2));
        System.out.println("r1 <= r2: " + (r1 <= r2));
        System.out.println();

        // 5. Logical Operators
        boolean bool1 = true, bool2 = false;
        System.out.println("5. Logical Operators");
        System.out.println("bool1 && bool2: " + (bool1 && bool2));
        System.out.println("bool1 || bool2: " + (bool1 || bool2));
        System.out.println("!bool1: " + (!bool1));
        System.out.println("!bool2: " + (!bool2));
        System.out.println();

        // 6. Bitwise Operators
        int bitA = 6, bitB = 3;
        System.out.println("6. Bitwise Operators");
        System.out.println("bitA & bitB: " + (bitA & bitB));
        System.out.println("bitA | bitB: " + (bitA | bitB));
        System.out.println("bitA ^ bitB: " + (bitA ^ bitB));
        System.out.println("~bitA: " + (~bitA));
        System.out.println("bitA << 1: " + (bitA << 1));
        System.out.println("bitA >> 1: " + (bitA >> 1));
        System.out.println();

        // 7. Ternary Operator
        int num = 7;
        System.out.println("7. Ternary Operator");
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
        System.out.println();

        // 8. Mix of Operators
        int m1 = 4, m2 = 2, m3 = 5;
        System.out.println("8. Mix of Operators");
        boolean complex = ((m1 + m2) > m3) && (m2 != 0);
        System.out.println("Condition ((a + b) > c) && (b != 0): " + complex);
    }
}

