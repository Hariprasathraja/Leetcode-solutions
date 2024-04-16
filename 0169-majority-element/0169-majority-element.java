class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer,Integer>map=new HashMap<>();
        int maxfreq=0,maxel=0;
        for(int i:nums){
            int freq = map.getOrDefault(i, 0) + 1;
            map.put(i, freq);
            if (freq > maxfreq){
                maxfreq = freq;
                maxel=i;
            }
        }
        if(maxfreq>=nums.length/2){
            return maxel;
        }else{
            return 0;
        }
    }
}