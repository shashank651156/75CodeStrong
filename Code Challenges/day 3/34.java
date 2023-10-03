public class Solution {
    public int[] searchRange(int[] nums, int target) {
    // Check if the target value exists in the array
        int t = binarySearch(nums, target);

        if (t == -1) {
            return new int[]{-1, -1};
        }

        int i = t;
        int j = t;

        while (i > 0 && nums[i - 1] == target) {
            i--;
        }

        while (j < nums.length - 1 && nums[j + 1] == target) {
            j++;
        }

        return new int[]{i, j};
}

    private int binarySearch(int[] a, int k) {
        int n = a.length;
        int low =0;
        int high = n-1;
        int mid;
        while (low <= high) {
            mid = (high + low) / 2;
            if (a[mid] == k) {
                return mid;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
