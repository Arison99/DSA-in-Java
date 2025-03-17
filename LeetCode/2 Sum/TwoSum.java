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

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

/*
 * Time Complexity: O(n) - We traverse the list containing n elements only once. 
 * Each lookup in the table costs only O(1) time.
 * 
 * Space Complexity: O(n) - The extra space required depends on the number of 
 * items stored in the hash table, which stores at most n elements.
 * 
 * Pseudo Code:
 * 1. Initialize an empty HashMap.
 * 2. Iterate through the array.
 * 3. For each element, calculate the difference needed to reach the target.
 * 4. Check if this difference is already in the HashMap.
 * 5. If it is, return the current index and the index of the difference.
 * 6. If not, add the current element and its index to the HashMap.
 * 7. If no solution is found, return an empty array (though the problem guarantees one solution).
 */
