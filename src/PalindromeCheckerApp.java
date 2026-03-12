import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        String word = "racecar";

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        // Stack Strategy Performance
        long startTime = System.nanoTime();
        boolean stackResult = stackStrategy.checkPalindrome(word);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque Strategy Performance
        startTime = System.nanoTime();
        boolean dequeResult = dequeStrategy.checkPalindrome(word);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Display Results
        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Stack Execution Time: " + stackTime + " ns");

        System.out.println("Deque Strategy Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");
    }
}