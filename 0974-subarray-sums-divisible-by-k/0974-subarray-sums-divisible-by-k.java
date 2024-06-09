class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        
        int sum=0,count=0;
        for(int i:nums){
            sum+=i;
            int remainder=sum%k;
            if(remainder<0){
                remainder+=k;
            }
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}