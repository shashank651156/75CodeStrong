class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0; // Count of modifications required
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) {
                    return false; // If more than one modification is needed, return false
                }
                // Try to make a modification to the current element or the next element
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return true;
    }
}
