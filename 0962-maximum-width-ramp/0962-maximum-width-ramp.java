class Solution {
    public int maxWidthRamp(int[] nums) {
        int res=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
           if(st.isEmpty()||nums[st.peek()] > nums[i]) st.push(i);
        }
        
        for(int j=nums.length-1;j>-1;j--){
            while(!st.isEmpty() && nums[j] >= nums[st.peek()]){
                res=Math.max(res,j-st.pop());
            }
        }
        return res;
    }
}