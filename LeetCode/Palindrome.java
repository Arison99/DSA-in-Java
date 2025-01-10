class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Convert the integer to a string
        String str = Integer.toString(x);

        // Use two pointers to compare characters from both ends
        int left = 0;
        int right = str.length() - 1;

        // Loop until the two pointers meet in the middle
        while (left < right) {
            // If characters at the current pointers do not match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Move the left pointer to the right
            left++;
            // Move the right pointer to the left
            right--;
        }

        // If all characters matched, it is a palindrome
        return true;
    }
}