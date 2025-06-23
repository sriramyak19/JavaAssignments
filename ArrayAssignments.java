import java.util.*;

public class ArrayAssignments {

    public static void main(String[] args) {
        // 1. Average value of array
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Average: " + (sum / arr.length));

        // 2. Check if array contains a value
        int search = 30;
        boolean found = false;
        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }
        System.out.println(search + (found ? " is found" : " is not found"));

        // 3. Find index of element
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + search + ": " + index);

        // 4. Remove element
        int remove = 30;
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int num : arr) {
            if (num != remove) {
                newArr[j++] = num;
            }
        }
        System.out.println("Array after removal: " + Arrays.toString(newArr));

        // 5. Max and Min
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);

        // 6. Reverse array
        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();

        // 7. Duplicate values (int)
        int[] dupArr = {10, 20, 10, 30, 20};
        System.out.print("Duplicate int values: ");
        for (int i = 0; i < dupArr.length; i++) {
            for (int k = i + 1; k < dupArr.length; k++) {
                if (dupArr[i] == dupArr[k]) {
                    System.out.print(dupArr[i] + " ");
                    break;
                }
            }
        }
        System.out.println();

        // 8. Duplicate values (String)
        String[] names = {"apple", "banana", "apple", "cherry"};
        System.out.print("Duplicate strings: ");
        for (int i = 0; i < names.length; i++) {
            for (int k = i + 1; k < names.length; k++) {
                if (names[i].equals(names[k])) {
                    System.out.print(names[i] + " ");
                    break;
                }
            }
        }
        System.out.println();

        // 9. Common elements
        String[] arr1 = {"apple", "banana", "grape"};
        String[] arr2 = {"banana", "mango", "apple"};
        System.out.print("Common elements: ");
        for (String s1 : arr1) {
            for (String s2 : arr2) {
                if (s1.equals(s2)) {
                    System.out.print(s1 + " ");
                }
            }
        }
        System.out.println();

        // 10. Remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : dupArr) set.add(num);
        System.out.println("Without duplicates: " + set);

        // 11. Second largest
        Arrays.sort(arr);
        System.out.println("Second largest: " + arr[arr.length - 2]);

        // 12. Second smallest
        System.out.println("Second smallest: " + arr[1]);

        // 13. Separate even and odd
        List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        System.out.println("Even first then odd: " + even + " " + odd);

        // 14. K largest elements
        int[] array = {4, 1, 7, 9, 3};
        int k = 3;
        Arrays.sort(array);
        System.out.print("K largest: ");
        for (int i = array.length - k; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();

        // 15. K smallest elements
        System.out.print("K smallest: ");
        for (int i = 0; i < k; i++) System.out.print(array[i] + " ");
        System.out.println();

        // 16. Swap two arrays using temp
        int[] a = {1, 2}, b = {3, 4};
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
        System.out.println("Swapped arrays: " + Arrays.toString(a) + ", " + Arrays.toString(b));

        // 17. Swap three numbers
        int x = 1, y = 2, z = 3, temp = x;
        x = y; y = z; z = temp;
        System.out.println("Swapped 3 numbers: x=" + x + ", y=" + y + ", z=" + z);

        // 18. Copy array
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) copyArr[i] = arr[i];
        System.out.println("Copied array: " + Arrays.toString(copyArr));

        // 19. Frequency of elements
        int[] freqArr = {1, 2, 2, 3, 3, 3};
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : freqArr) freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        System.out.println("Frequency: " + freqMap);

        // 20. Reverse print
        System.out.print("Reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();

        // 21. Even position
        System.out.print("Even positions: ");
        for (int i = 1; i < arr.length; i += 2) System.out.print(arr[i] + " ");
        System.out.println();

        // 22. Odd position
        System.out.print("Odd positions: ");
        for (int i = 0; i < arr.length; i += 2) System.out.print(arr[i] + " ");
        System.out.println();

        // 23. Sum of all elements
        sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum);

        // 24. Sort ascending
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        // 25. Sort descending
        Integer[] desc = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(desc, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(desc));

        // 26. Swap two arrays again (repeat)
        int[] m = {1, 2}, n = {3, 4};
        for (int i = 0; i < m.length; i++) {
            int temp2 = m[i];
            m[i] = n[i];
            n[i] = temp2;
        }
        System.out.println("Swapped again: " + Arrays.toString(m) + ", " + Arrays.toString(n));

        // 27. Swap three arrays
        int[] arr1x = {1}, arr2x = {2}, arr3x = {3};
        temp = arr1x[0];
        arr1x[0] = arr2x[0];
        arr2x[0] = arr3x[0];
        arr3x[0] = temp;
        System.out.println("Swapped 3 arrays: " + arr1x[0] + ", " + arr2x[0] + ", " + arr3x[0]);
    }
}

