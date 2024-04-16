class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer,Integer>map=new HashMap<>();
        int maxfreq=0,max=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i, 0) + 1);
            if (map.get(i) > maxfreq){
                maxfreq = map.get(i);
                max=i;
            }
        }
        if(maxfreq>nums.length/2){
            return max;
        }else{
            return 0;
        }
    }
}