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
}