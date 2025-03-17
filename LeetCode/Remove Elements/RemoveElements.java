public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Count of elements not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElements re = new RemoveElements();
        int k = re.removeElement(nums, val);
        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

/*
 * Pseudocode:
 * 1. Initialize a counter k to 0.
 * 2. Iterate through each element in the array.
 * 3. If the current element is not equal to val, assign it to nums[k] and increment k.
 * 4. Return k, the count of elements not equal to val.
 *
 * Time Complexity: O(n) - We iterate through the array once.
 * Space Complexity: O(1) - We use a constant amount of extra space.
 */
