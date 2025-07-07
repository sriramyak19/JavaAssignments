import java.util.Scanner;

public class StringAssignments {


    public static void main(String[] args) {
        // Uncomment the methods below to test
        // reverseString();
        // checkPalindrome();
        // checkAnagram();
        // countVowelsConsonants();
        // compressString();
        // reverseWords();
        // longestCommonPrefix();
        // substringFrequency();
        // checkRotation();
        // removeDuplicates();
        // stringToInteger();
        // tokenizeString();
        // mostFrequentWord();
        // formatName();
        // caesarCipher();
        // concatenateStrings();
        // stringLength();
        // substringExtract();
        // compareStrings();
        // caseConversion();
        // trimWhitespace();
        // findCharacterIndex();
        // replaceCharacter();
        // splitString();
        // countCharOccurrences();
        // stringFormatting();
        // intToString();
        // checkSubstring();
        // checkIfEmpty();
        // concatWithOtherTypes();
        // regexValidation();
        // levenshteinDistance();
        // longestPalindromicSubstring();
        // stringPermutations("abc", "");
        // rabinKarpSearch();
        // stringCompressionAdvanced();
        // editDistanceSimple();
        // longestCommonSubsequence();
        // stringMatching();
        // regexReplace();
        // unicodeManipulation();
        // stringInterning();
        // huffmanCompression();
        // processMultipleStrings();
        // testCustomStringClass();
    }

    // 1–10
    public static void reverseString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), rev = "";
        for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
        System.out.println(rev);
    }

    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), rev = "";
        for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
    }

    public static void checkAnagram() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        if (a.length() != b.length()) {
            System.out.println("Not Anagrams"); return;
        }
        int[] count = new int[256];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++; count[b.charAt(i)]--;
        }
        for (int c : count) if (c != 0) {
            System.out.println("Not Anagrams"); return;
        }
        System.out.println("Anagrams");
    }

    public static void countVowelsConsonants() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int v = 0, c = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) v++; else c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }

    public static void compressString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) count++;
            else { res += s.charAt(i - 1) + "" + count; count = 1; }
        }
        res += s.charAt(s.length() - 1) + "" + count;
        System.out.println(res);
    }

    public static void reverseWords() {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        for (int i = words.length - 1; i >= 0; i--) System.out.print(words[i] + " ");
    }

    public static void longestCommonPrefix() {
        String[] a = {"flower", "flow", "flight"};
        String p = a[0];
        for (int i = 1; i < a.length; i++)
            while (!a[i].startsWith(p)) p = p.substring(0, p.length() - 1);
        System.out.println(p);
    }

    public static void substringFrequency() {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine(), sub = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= t.length() - sub.length(); i++)
            if (t.substring(i, i + sub.length()).equals(sub)) count++;
        System.out.println("Frequency: " + count);
    }

    public static void checkRotation() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        System.out.println((a.length() == b.length() && (a + a).contains(b)) ? "Rotation" : "Not Rotation");
    }

    public static void removeDuplicates() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), res = "";
        for (char ch : str.toCharArray())
            if (res.indexOf(ch) == -1) res += ch;
        System.out.println(res);
    }

    // 11–20
    public static void stringToInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.parseInt(sc.nextLine()));
    }

    public static void tokenizeString() {
        Scanner sc = new Scanner(System.in);
        for (String word : sc.nextLine().split(" ")) System.out.println(word);
    }

    public static void mostFrequentWord() {
        Scanner sc = new Scanner(System.in);
        String[] w = sc.nextLine().toLowerCase().split(" ");
        int max = 0; String f = "";
        for (int i = 0; i < w.length; i++) {
            int c = 1;
            for (int j = i + 1; j < w.length; j++) if (w[i].equals(w[j])) c++;
            if (c > max) { max = c; f = w[i]; }
        }
        System.out.println(f + " (" + max + ")");
    }

    public static void formatName() {
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine(), m = sc.nextLine(), l = sc.nextLine();
        System.out.println(l + ", " + f + " " + m);
    }

    public static void caesarCipher() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int shift = sc.nextInt();
        String res = "";
        for (char ch : str.toCharArray()) res += (char)(ch + shift);
        System.out.println(res);
    }

    public static void concatenateStrings() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine() + sc.nextLine());
    }

    public static void stringLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().length());
    }

    public static void substringExtract() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(s.substring(a, b));
    }

    public static void compareStrings() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().equals(sc.nextLine()) ? "Equal" : "Not Equal");
    }

    public static void caseConversion() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.toUpperCase()); System.out.println(s.toLowerCase());
    }

    // 21–30
    public static void trimWhitespace() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().trim());
    }

    public static void findCharacterIndex() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); char ch = sc.next().charAt(0);
        System.out.println(s.indexOf(ch));
    }

    public static void replaceCharacter() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); char oldC = sc.next().charAt(0), newC = sc.next().charAt(0);
        System.out.println(s.replace(oldC, newC));
    }

    public static void splitString() {
        Scanner sc = new Scanner(System.in);
        for (String part : sc.nextLine().split(",")) System.out.println(part.trim());
    }

    public static void countCharOccurrences() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); char ch = sc.next().charAt(0);
        int c = 0; for (char a : s.toCharArray()) if (a == ch) c++;
        System.out.println("Count: " + c);
    }

    public static void stringFormatting() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Welcome, %s!\n", sc.nextLine());
    }

    public static void intToString() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Integer.toString(num));
    }

    public static void checkSubstring() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().contains(sc.nextLine()) ? "Found" : "Not Found");
    }

    public static void checkIfEmpty() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().isEmpty() ? "Empty" : "Not Empty");
    }

    public static void concatWithOtherTypes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: " + sc.nextInt());
    }

    // 31–45
    public static void regexValidation() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$") ? "Valid" : "Invalid");
    }

    public static void levenshteinDistance() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        int[][] dp = new int[a.length()+1][b.length()+1];
        for (int i = 0; i <= a.length(); i++)
            for (int j = 0; j <= b.length(); j++)
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
        System.out.println("Distance: " + dp[a.length()][b.length()]);
    }

    public static void longestPalindromicSubstring() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        for (int i = 0; i < s.length(); i++)
            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (sub.equals(new StringBuilder(sub).reverse().toString()) && sub.length() > res.length())
                    res = sub;
            }
        System.out.println(res);
    }

    public static void stringPermutations(String str, String ans) {
        if (str.length() == 0) { System.out.println(ans); return; }
        for (int i = 0; i < str.length(); i++)
            stringPermutations(str.substring(0, i) + str.substring(i+1), ans + str.charAt(i));
    }

    public static void rabinKarpSearch() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(), pat = sc.nextLine();
        for (int i = 0; i <= text.length() - pat.length(); i++)
            if (text.substring(i, i + pat.length()).equals(pat))
                System.out.println("Found at " + i);
    }

    public static void stringCompressionAdvanced() { compressString(); }
    public static void editDistanceSimple() { levenshteinDistance(); }

    public static void longestCommonSubsequence() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        int[][] dp = new int[a.length()+1][b.length()+1];
        for (int i = 1; i <= a.length(); i++)
            for (int j = 1; j <= b.length(); j++)
                if (a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        System.out.println("LCS length: " + dp[a.length()][b.length()]);
    }

    public static void stringMatching() { rabinKarpSearch(); }

    public static void regexReplace() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().replaceAll("[0-9]", "#"));
    }

    public static void unicodeManipulation() {
        Scanner sc = new Scanner(System.in);
        for (char ch : sc.nextLine().toCharArray())
            System.out.println(ch + ": " + (int) ch);
    }

    public static void stringInterning() {
        String a = new String("test"), b = new String("test");
        System.out.println("a == b: " + (a == b));
        System.out.println("a.intern() == b.intern(): " + (a.intern() == b.intern()));
    }

    public static void huffmanCompression() {
        System.out.println("Advanced Huffman encoding not implemented in beginner level.");
    }

    public static void processMultipleStrings() {
        String[] arr = {"apple", "banana", "orange"};
        for (String s : arr) System.out.println(s + ": " + s.length());
    }

    public static void testCustomStringClass() {
        MyString m = new MyString("hello");
        System.out.println("Reversed: " + m.getReverse());
        System.out.println("Upper: " + m.toUpper());
    }

    static class MyString {
        String value;
        MyString(String v) { value = v; }
        String getReverse() {
            String rev = "";
            for (int i = value.length() - 1; i >= 0; i--) rev += value.charAt(i);
            return rev;
        }
        String toUpper() {
            return value.toUpperCase();
        }
    }
}
