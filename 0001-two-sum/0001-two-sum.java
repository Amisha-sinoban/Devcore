import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, return the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the current number with its index
            map.put(nums[i], i);
        }

        // In case there's no solution (though problem guarantees one)
        return new int[] {};
    }
}
