import java.util.ArrayList;

public class Solution {
    // Method to find the single non-duplicate element
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // Handle case where array size is 1
        if (n == 1) {
            return nums[0];
        }

        // Traverse the array to find the unique element
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                // Check the first element
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            } else if (i == n - 1) {
                // Check the last element
                if (nums[i] != nums[i - 1]) {
                    return nums[i];
                }
            } else {
                // Check elements in the middle
                if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                    return nums[i];
                }
            }
        }

        // Return -1 if no unique element is found (this shouldn't happen with valid input)
        return -1;
    }
}