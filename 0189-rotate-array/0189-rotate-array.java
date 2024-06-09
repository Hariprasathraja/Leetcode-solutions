class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
        }
    private void rev(int[] ar,int start,int end){
        while(start<end){
            int tem=ar[start];
            ar[start++]=ar[end];
            ar[end--]=tem;
        }
    }
}