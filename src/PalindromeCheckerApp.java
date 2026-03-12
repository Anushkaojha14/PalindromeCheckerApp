import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two Pointer Method
    public static boolean twoPointerCheck(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method 2: Stack Based Check
    public static boolean stackCheck(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque Based Check
    public static boolean dequeCheck(String str) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Two Pointer Performance
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack Performance
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque Performance
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nPalindrome Results:");
        System.out.println("Two Pointer Method: " + result1);
        System.out.println("Stack Method: " + result2);
        System.out.println("Deque Method: " + result3);

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Two Pointer Method: " + (end1 - start1));
        System.out.println("Stack Method: " + (end2 - start2));
        System.out.println("Deque Method: " + (end3 - start3));

        sc.close();
    }
}