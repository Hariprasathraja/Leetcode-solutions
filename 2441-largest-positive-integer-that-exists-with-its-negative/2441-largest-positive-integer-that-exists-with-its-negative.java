class Solution {
    public int findMaxK(int[] nums) {
        Map<Integer,Boolean>map=new HashMap<>();
        for(int i:nums){
            map.put(i,true);
        }
        int max=-1;
        for(int i:nums){
            if(i>0&&map.containsKey(-i)){
                max=Math.max(max,i);
            }
        }
        return max;
    }
}