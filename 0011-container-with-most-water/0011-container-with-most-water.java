class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1, left=0, right=n;
        int res=0;
        while(left<right){
            int l=height[left], r=height[right];
        
            res=Math.max(res,Math.min(l,r)*(right-left));    
            if(l<r){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}