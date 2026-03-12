public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the application.
     */
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - Version 1.0");

        String word = "A man a plan a canal Panama";

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }

    // Two-pointer palindrome check
    public static boolean checkPalindrome(String str) {

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
}