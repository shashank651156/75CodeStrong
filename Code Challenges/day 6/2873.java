class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=-1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k =j+1; k<n; k++){
                    ans=Math.max(ans, (long) (nums[i] -nums[j]) * (long) nums[k]);
                }
            }
        }
        return (ans==-1)? 0:ans;
    }
}
