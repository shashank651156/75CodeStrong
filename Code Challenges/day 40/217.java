class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1)return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!(set.add(i)))return true;
        }
        return false;
    }
}