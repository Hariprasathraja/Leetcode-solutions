class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int complement=k-i;
            if(map.getOrDefault(complement,0)>0){
                count++;
                map.put(complement,map.get(complement)-1);
            }else{
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        return count;
    }
}