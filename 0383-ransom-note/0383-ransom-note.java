class Solution {
    /**
     * Checks if a ransom note can be constructed from a magazine.
     *
     * @param ransomNote The string for the ransom note.
     * @param magazine   The string for the magazine.
     * @return True if the ransomNote can be constructed, False otherwise.
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        // Since we are only dealing with lowercase English letters,
        // an array is more efficient than a HashMap.
        int[] charCounts = new int[26];

        // 1. Count every character in the magazine.
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // 2. Decrement counts for characters in the ransom note.
        for (char c : ransomNote.toCharArray()) {
            // If a character count goes below zero, the magazine didn't have it.
            if (charCounts[c - 'a'] == 0) {
                return false;
            }
            charCounts[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example 1:
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Input: ransomNote = \"" + ransomNote1 + "\", magazine = \"" + magazine1 + "\"");
        System.out.println("Output: " + sol.canConstruct(ransomNote1, magazine1)); // Expected: false

        // Example 2:
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("\nInput: ransomNote = \"" + ransomNote2 + "\", magazine = \"" + magazine2 + "\"");
        System.out.println("Output: " + sol.canConstruct(ransomNote2, magazine2)); // Expected: false

        // Example 3:
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("\nInput: ransomNote = \"" + ransomNote3 + "\", magazine = \"" + magazine3 + "\"");
        System.out.println("Output: " + sol.canConstruct(ransomNote3, magazine3)); // Expected: true
    }
}