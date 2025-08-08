import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Get the total length of the string.
        int n = s.length();
        
        // This will store the maximum length found so far.
        int maxLength = 0;

        // A HashSet to store characters in the current window.
        // It provides fast O(1) average time complexity for add, remove, and contains.
        Set<Character> charSet = new HashSet<>();

        // 'left' is the left pointer of our sliding window.
        int left = 0;

        // 'right' is the right pointer, which iterates through the string.
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            // If the current character is already in the set, it's a duplicate.
            // We need to shrink the window from the left until the duplicate is removed.
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add the current unique character to the set (expanding the window).
            charSet.add(currentChar);

            // Calculate the length of the current window (right - left + 1)
            // and update maxLength if the current window is longer.
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}