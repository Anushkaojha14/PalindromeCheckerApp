public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "madam";

        System.out.println("===================================");
        System.out.println("    PALINDROME CHECKER - UC2      ");
        System.out.println("===================================");
        System.out.println("Given Word: " + word);
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("Result: The given word is a PALINDROME.");
        } else {
            System.out.println("Result: The given word is NOT a palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}