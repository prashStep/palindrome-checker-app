import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     * JVM starts execution from here.
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        // Hardcoded string
        String word = "racecar";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into stack and queue
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            stack.push(ch);   // LIFO
            queue.add(ch);    // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        for (int i = 0; i < word.length(); i++) {

            char stackChar = stack.pop();      // Last In First Out
            char queueChar = queue.remove();   // First In First Out

            if (stackChar != queueChar) {
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