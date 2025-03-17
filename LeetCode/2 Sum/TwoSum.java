import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the difference and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference needed to reach the target
            int difference = target - nums[i];
            // Check if the difference is already in the map
            if (map.containsKey(difference)) {
                // If found, return the indices
                return new int[] { map.get(difference), i };
            }
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found (should not happen as per problem constraints)
        return new int[] {};
    }
}
