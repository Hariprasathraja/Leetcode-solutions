class Solution {
    public int[] resultsArray(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<=nums.length-k;i++){
            boolean valid=true;
            int element=nums[i];
            
            for(int j=i;j<i+k-1;j++){
                
                if(nums[j]+1!=nums[j+1]){
                    valid=false;
                    break;
                }
                element=Math.max(element,nums[j+1]);
            }
            list.add(valid ?element:-1);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}