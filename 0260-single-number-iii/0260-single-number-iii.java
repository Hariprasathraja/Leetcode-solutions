class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                set.remove(i);
            }
        }
        int j=0;
        for(int i:set){
            res[j++]=i;
        }
        return res;
    }
}