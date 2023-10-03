class Solution{
    public int numIdenticalPairs(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num: nums){
            if(map.containsKey(num)){
                count += map.get(num);
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        return count;
    }
}