class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{occur(nums,target,1),occur(nums,target,2)};
    }
    private int occur(int[] arr,int t,int f){
        int res=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low/2);
            if(arr[mid]==t){
                res=mid;
                if(f==1) high=mid-1;
                else low=mid+1;
            }else if(arr[mid]<t){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}
