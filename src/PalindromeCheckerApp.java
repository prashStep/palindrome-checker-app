import java.util.Stack;
public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     * JVM starts execution from here.
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        // Hardcoded string
        String word = "madam";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < word.length(); i++) {

            char ch = stack.pop();

            if (word.charAt(i) != ch) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}