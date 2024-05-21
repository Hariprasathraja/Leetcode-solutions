class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }
    private void quicksort(int[] n,int low,int high){
        if(low<high){
            int pivotindx=partition(n,low,high);
            quicksort(n,low,pivotindx-1);
            quicksort(n,pivotindx+1,high);
        }
    }
    private int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
            }
        }
        i++;
        int tem=arr[i];
        arr[i]=arr[high];
        arr[high]=tem;
        
        return i;
    }
}