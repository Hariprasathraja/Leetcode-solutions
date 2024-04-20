class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1=m-1,p2=n-1,index=m+n-1;
    while(p2>-1){
        if(p1>-1&&nums1[p1]>nums2[p2]){
            nums1[index--]=nums1[p1--];
        }else{
            nums1[index--]=nums2[p2--];
        }
    }
    }
}