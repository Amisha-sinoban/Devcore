class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // Pointer for the place to insert allowed elements
        
        for (int num : nums) {
            // If we are at the first two elements, always keep them
            // Otherwise, compare with the element two steps before
            if (i < 2 || num != nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }
        
        return i; // Length of modified array with no more than two duplicates
    }
}
