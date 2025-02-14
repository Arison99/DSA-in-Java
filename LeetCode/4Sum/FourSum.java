import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    // Method to find all unique quadruplets in the array that sum up to the target
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result; // Return empty list if input array is null or has less than 4 elements
        }
        Arrays.sort(nums); // Sort the array to make it easier to skip duplicates and use two pointers
        int n = nums.length;
        
        // Iterate through the array with the first pointer
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for the first pointer
            // Iterate through the array with the second pointer
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicates for the second pointer
                int left = j + 1; // Initialize the left pointer
                int right = n - 1; // Initialize the right pointer
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // Calculate the sum of the four elements
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // Add the quadruplet to the result list
                        while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates for the left pointer
                        while (left < right && nums[right] == nums[right - 1]) right--; // Skip duplicates for the right pointer
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Move the left pointer to the right if the sum is less than the target
                    } else {
                        right--; // Move the right pointer to the left if the sum is greater than the target
                    }
                }
            }
        }
        return result; // Return the list of quadruplets
    }

    public static void main(String[] args) {
        FourSum solution = new FourSum();
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        System.out.println(solution.fourSum(nums1, target1)); // Output: [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]

        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        System.out.println(solution.fourSum(nums2, target2)); // Output: [[2, 2, 2, 2]]
    }
}