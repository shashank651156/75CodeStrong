package day1;
public class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1; // Initialize the goal to the end of the array.
        
        // Start iterating from the second-to-last element backward to the first element.
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i; // Update the goal if it's possible to reach from the current position.
            }
        }
        
        return goal == 0; // Return true if goal is 0, indicating it's possible to reach the end.
    }
}