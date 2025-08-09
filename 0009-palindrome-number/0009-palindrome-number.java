class Solution {
    /**
     * Checks if an integer is a palindrome without converting it to a string.
     *
     * @param x The integer to check.
     * @return true if x is a palindrome, false otherwise.
     */
    public boolean isPalindrome(int x) {
        // Edge Case 1: Negative numbers are not palindromes.
        // Edge Case 2: If the last digit is 0, the first digit must also be 0
        // for it to be a palindrome. This is only true for the number 0 itself.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        // We only need to revert the second half of the number.
        // The loop stops when x is no longer greater than the reverted number.
        while (x > revertedNumber) {
            // Get the last digit of x and add it to the reverted number.
            revertedNumber = revertedNumber * 10 + x % 10;
            // Remove the last digit from x.
            x /= 10;
        }

        // After the loop, we have two cases for a palindrome:
        // 1. For an even number of digits (e.g., 1221), x will be 12 and revertedNumber will be 12.
        //    So, we check if x == revertedNumber.
        // 2. For an odd number of digits (e.g., 12321), x will be 12 and revertedNumber will be 123.
        //    The middle digit (3) is irrelevant, so we can remove it by dividing revertedNumber by 10.
        //    So, we check if x == revertedNumber / 10.
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
