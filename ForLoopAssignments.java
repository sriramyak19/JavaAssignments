public class ForLoopAssignments {

    public static void main(String[] args) {

        // 1. Natural numbers from 1 to n
        int n = 10;
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
        System.out.println();

        // 2. Even numbers 1 to 100
        for (int i = 2; i <= 100; i += 2) System.out.print(i + " ");
        System.out.println();

        // 3. Odd numbers 1 to 100
        for (int i = 1; i <= 100; i += 2) System.out.print(i + " ");
        System.out.println();

        // 4. Sum of even numbers 1 to n
        int sum = 0;
        for (int i = 2; i <= n; i += 2) sum += i;
        System.out.println("Sum of even numbers: " + sum);

        // 5. Sum of odd numbers 1 to n
        sum = 0;
        for (int i = 1; i <= n; i += 2) sum += i;
        System.out.println("Sum of odd numbers: " + sum);

        // 6. Multiplication table
        int num = 5;
        for (int i = 1; i <= 10; i++) System.out.println(num + " x " + i + " = " + (num * i));

        // 7. Count digits of a number
        int number = 12345, count = 0;
        for (int temp = number; temp > 0; temp /= 10) count++;
        System.out.println("Digit count: " + count);

        // 8. Sum of digits
        int sumDigits = 0;
        for (int temp = number; temp > 0; temp /= 10) sumDigits += temp % 10;
        System.out.println("Sum of digits: " + sumDigits);

        // 9. Natural numbers in reverse
        for (int i = n; i >= 1; i--) System.out.print(i + " ");
        System.out.println();

        // 10. Check Prime
        boolean isPrime = true;
        num = 29;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) { isPrime = false; break; }
        }
        System.out.println(num + (isPrime ? " is Prime" : " is not Prime"));

        // 11. All Prime numbers 1 to n
        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { isPrime = false; break; }
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();

        // 12. Sum of all prime numbers 1 to n
        int primeSum = 0;
        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { isPrime = false; break; }
            }
            if (isPrime) primeSum += i;
        }
        System.out.println("Sum of primes: " + primeSum);

        // 13. Check Armstrong
        number = 153;
        int original = number, result = 0;
        while (original != 0) {
            int digit = original % 10;
            result += digit * digit * digit;
            original /= 10;
        }
        System.out.println(number + (result == number ? " is Armstrong" : " is not Armstrong"));

        // 14. Armstrong numbers 1 to n
        for (int i = 1; i <= 999; i++) {
            int temp = i, digits = 0, temp2 = i;
            while (temp2 != 0) {
                digits++;
                temp2 /= 10;
            }
            int arm = 0;
            temp2 = i;
            while (temp2 != 0) {
                int digit = temp2 % 10;
                int power = 1;
                for (int j = 0; j < digits; j++) power *= digit;
                arm += power;
                temp2 /= 10;
            }
            if (arm == i) System.out.print(i + " ");
        }
        System.out.println();

        // 15. Perfect number
        number = 28;
        sum = 0;
        for (int i = 1; i < number; i++) if (number % i == 0) sum += i;
        System.out.println(number + (sum == number ? " is Perfect" : " is not Perfect"));

        // 16. All Perfect numbers 1 to 1000
        for (int i = 1; i <= 1000; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) if (i % j == 0) sum += j;
            if (sum == i) System.out.print(i + " ");
        }
        System.out.println();

        // 17. Strong number
        number = 145;
        int temp = number, factSum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int j = 1; j <= digit; j++) fact *= j;
            factSum += fact;
            temp /= 10;
        }
        System.out.println(number + (factSum == number ? " is Strong" : " is not Strong"));

        // 18. All Strong numbers 1 to 1000
        for (int i = 1; i <= 1000; i++) {
            temp = i;
            factSum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                int fact = 1;
                for (int j = 1; j <= digit; j++) fact *= j;
                factSum += fact;
                temp /= 10;
            }
            if (factSum == i) System.out.print(i + " ");
        }
        System.out.println();

        // 19. Swap first and last digit
        number = 12345;
        int last = number % 10;
        int digits = (int)Math.log10(number);
        int first = number / (int)Math.pow(10, digits);
        int middle = number % (int)Math.pow(10, digits);
        middle = middle - last + first;
        int swapped = last * (int)Math.pow(10, digits) + middle;
        System.out.println("Swapped: " + swapped);

        // 20. Swap with third variable
        int a = 5, b = 10, tempVar;
        tempVar = a; a = b; b = tempVar;
        System.out.println("a=" + a + " b=" + b);

        // 21. Swap without third variable
        a = 5; b = 10;
        a = a + b; b = a - b; a = a - b;
        System.out.println("a=" + a + " b=" + b);

        // 22 & 23. Power of number without pow
        int base = 2, exp = 3, power = 1;
        for (int i = 1; i <= exp; i++) power *= base;
        System.out.println("Power: " + power);

        // 24. Power using Math.pow
        System.out.println("Power using pow: " + Math.pow(2, 3));

        // 25. Palindrome check
        number = 121;
        int rev = 0, orig = number;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        System.out.println(orig + (rev == orig ? " is Palindrome" : " is not Palindrome"));

        // 26. Fibonacci series
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(t1 + " ");
            int next = t1 + t2;
            t1 = t2;
            t2 = next;
        }
        System.out.println();

        // 27. Fibonacci with recursion
        System.out.print("Fibonacci (recursion): ");
        for (int i = 0; i < 10; i++) System.out.print(fib(i) + " ");
        System.out.println();

        // 28. Frequency of digits
        number = 112358;
        int[] freq = new int[10];
        while (number != 0) {
            freq[number % 10]++;
            number /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println(i + ": " + freq[i]);
        }

        // 29. ASCII characters with values
        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " = " + (char)i);
        }

        // 30. Alphabets a to z
        for (char c = 'a'; c <= 'z'; c++) System.out.print(c + " ");
        System.out.println();

        // 31. Uppercase A to Z
        for (char c = 'A'; c <= 'Z'; c++) System.out.print(c + " ");
        System.out.println();

        // 32. Lowercase a to z
        for (char c = 'a'; c <= 'z'; c++) System.out.print(c + " ");
        System.out.println();

        // 33. Factors of number
        number = 28;
        for (int i = 1; i <= number; i++) if (number % i == 0) System.out.print(i + " ");
        System.out.println();

        // 34. HCF (GCD)
        int x = 36, y = 60, hcf = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) hcf = i;
        }
        System.out.println("HCF: " + hcf);

        // 35. LCM
        int lcm = (x * y) / hcf;
        System.out.println("LCM: " + lcm);

        // 36. Prime factors
        number = 84;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }

    // Helper method for Fibonacci (recursion)
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}

