class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sorted=new int[nums.length];
        int start=0,end=nums.length-1;
        for(int i=nums.length-1;i>-1;i--){
            if(Math.abs(nums[start])>=Math.abs(nums[end])){
                sorted[i]=nums[start]*nums[start];
                start++;
            }else{
                sorted[i]=nums[end]*nums[end];
                end--;
            }
        }
        return sorted;
    }
}

               