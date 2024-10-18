class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max=0;
        for(int i:nums){
            max|=i;
        }
        return count(nums,0,0,max);
    }
    public int count(int[] arr, int ind, int curOr, int maxOr){
        if(ind==arr.length){
            return curOr==maxOr?1:0;
        }
        int exclude=count(arr,ind+1,curOr,maxOr);
        int include=count(arr,ind+1,curOr|arr[ind],maxOr);
        
        return exclude+include;
    }
}