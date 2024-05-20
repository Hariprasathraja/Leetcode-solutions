class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=occur(nums,target,true);
        result[1]=occur(nums,target,false);
        return result;
    }
    private int occur(int[] arr,int t,boolean b){
        int res=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low/2);
            if(arr[mid]>t||(b&&arr[mid]==t)){
                high=mid-1;
            }else{
                low=mid+1;
            }
            if(arr[mid]==t) res=mid;
        }
        return res;
    }
}
