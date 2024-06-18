class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==3) map.remove(i);
        }
        int res=0;
        for(int i:map.keySet()){
            res=i;
        }
        return res;
    }
}