public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     * JVM starts execution from here.
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        // Hardcoded string
        String word = "racecar";

        // Convert string to character array
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}