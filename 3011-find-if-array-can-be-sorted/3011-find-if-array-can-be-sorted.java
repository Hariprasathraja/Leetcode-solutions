class Solution {
    public boolean canSortArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,helper(i));
        }
        
        for(int i=0;i<nums.length-1;i++){
            boolean fl=false;
            
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]<nums[j+1]) continue;
                
                if(map.get(nums[j])==map.get(nums[j+1])){
                    int tem=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tem;
                    fl=true;
                }else{
                    return false;
                }
            }
            
            if(!fl) break;
        }
        return true;
    }
    
    public int helper(int n){
        int count=0;
        while(n>0){
            count+=(n&1);
            n>>=1;
        }
        return count;
    }
}