/**
 * The SearchInsert class provides a method to find the index at which a target value should be inserted
 * into a sorted array of integers, such that the array remains sorted.
 * 
 * The main method demonstrates the usage of the searchInsert method.
 * 
 * Problem Explanation:
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * 
 * Example:
 * Input: nums = [1, 3, 5, 6], target = 5
 * Output: 2
 * 
 * Input: nums = [1, 3, 5, 6], target = 2
 * Output: 1
 * 
 * Input: nums = [1, 3, 5, 6], target = 7
 * Output: 4
 * 
 * Input: nums = [1, 3, 5, 6], target = 0
 * Output: 0
 * 
 * Constraints:
 * - The array is sorted in ascending order.
 * - The array does not contain duplicates.
 * - The target is an integer.
 * 
 * Method:
 * - The searchInsert method uses a binary search algorithm to find the target or the appropriate insertion index.
 * - It initializes two pointers, low and high, to the start and end of the array, respectively.
 * - It calculates the mid index and compares the mid element with the target.
 * - If the mid element is equal to the target, it returns the mid index.
 * - If the mid element is less than the target, it adjusts the low pointer to mid + 1.
 * - If the mid element is greater than the target, it adjusts the high pointer to mid - 1.
 * - The loop continues until low is greater than high, at which point low is the insertion index.
 */
public class SearchInsert {
    
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert.searchInsert(nums, target));
    }
}

