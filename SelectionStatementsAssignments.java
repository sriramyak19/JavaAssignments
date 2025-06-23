public class SelectionStatementsAssignments {

    public static void main(String[] args) {

        // 1. Max between two numbers
        int a = 10, b = 20;
        if (a > b) System.out.println("Max of two: " + a);
        else System.out.println("Max of two: " + b);

        // 2. Max among three numbers
        int x = 10, y = 25, z = 15;
        if (x >= y && x >= z) System.out.println("Max of three: " + x);
        else if (y >= x && y >= z) System.out.println("Max of three: " + y);
        else System.out.println("Max of three: " + z);

        // 3. Divisible by 3
        int num = 9;
        if (num % 3 == 0) System.out.println(num + " is divisible by 3");
        else System.out.println(num + " is not divisible by 3");

        // 4. Divisible by 5
        if (num % 5 == 0) System.out.println(num + " is divisible by 5");
        else System.out.println(num + " is not divisible by 5");

        // 5. Divisible by 11
        if (num % 11 == 0) System.out.println(num + " is divisible by 11");
        else System.out.println(num + " is not divisible by 11");

        // 6. Even or Odd
        if (num % 2 == 0) System.out.println(num + " is even");
        else System.out.println(num + " is odd");

        // 7. Leap year
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.println(year + " is a leap year");
        else System.out.println(year + " is not a leap year");

        // 8. Digit or not
        char ch = '5';
        if (ch >= '0' && ch <= '9') System.out.println(ch + " is a digit");
        else System.out.println(ch + " is not a digit");

        // 9. Alphabet or not
        ch = 'A';
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) System.out.println(ch + " is an alphabet");
        else System.out.println(ch + " is not an alphabet");

        // 10. Digit, Alphabet or Special Character
        ch = '#';
        if (ch >= '0' && ch <= '9') System.out.println(ch + " is a digit");
        else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) System.out.println(ch + " is an alphabet");
        else System.out.println(ch + " is a special character");

        // 11. Positive or Negative
        num = -10;
        if (num > 0) System.out.println(num + " is positive");
        else if (num < 0) System.out.println(num + " is negative");
        else System.out.println("Number is zero");

        // 12. Celsius to Fahrenheit
        double celsius = 37;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Celsius to Fahrenheit: " + fahrenheit);

        // 13. Fahrenheit to Celsius
        fahrenheit = 98.6;
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Fahrenheit to Celsius: " + celsius);

        // 14. Vowel or Consonant
        ch = 'e';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is a vowel");
        else System.out.println(ch + " is a consonant");

        // 15. Uppercase or Lowercase
        ch = 'G';
        if (ch >= 'A' && ch <= 'Z') System.out.println(ch + " is uppercase");
        else if (ch >= 'a' && ch <= 'z') System.out.println(ch + " is lowercase");
        else System.out.println(ch + " is not an alphabet");

        // 16. Week day by number
        int day = 3;
        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");
        else System.out.println("Invalid day");

        // 17. Days in month
        int month = 2;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("31 days");
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30 days");
        else if (month == 2)
            System.out.println("28 or 29 days");
        else
            System.out.println("Invalid month");

        // 18. Triangle type
        int side1 = 5, side2 = 5, side3 = 5;
        if (side1 == side2 && side2 == side3)
            System.out.println("Equilateral triangle");
        else if (side1 == side2 || side2 == side3 || side1 == side3)
            System.out.println("Isosceles triangle");
        else
            System.out.println("Scalene triangle");

        // 19. Eligible to vote
        int age = 18;
        if (age >= 18) System.out.println("Eligible to vote");
        else System.out.println("Not eligible to vote");

        // 20. Division by percentage
        int percentage = 55;
        if (percentage >= 60) System.out.println("Division 1");
        else if (percentage >= 45) System.out.println("Division 2");
        else if (percentage >= 30) System.out.println("Division 3");
        else System.out.println("Fail");

        // 21. Grade based on marks of 5 subjects
        int maths = 85, physics = 75, chemistry = 65, english = 70, hindi = 60;
        int total = maths + physics + chemistry + english + hindi;
        percentage = total / 5;
        if (percentage >= 90) System.out.println("Grade A");
        else if (percentage >= 80) System.out.println("Grade B");
        else if (percentage >= 70) System.out.println("Grade C");
        else if (percentage >= 60) System.out.println("Grade D");
        else if (percentage >= 40) System.out.println("Grade E");
        else System.out.println("Grade F");
    }
}
