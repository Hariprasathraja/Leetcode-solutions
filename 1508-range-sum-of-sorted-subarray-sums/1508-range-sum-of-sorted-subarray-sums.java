class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                list.add(sum);
            }
        }
        Integer[] arr=list.toArray(new Integer[0]);
        Arrays.sort(arr);
        long sum=0;
        for(int i=left-1;i<right;i++){
            sum+=arr[i];
            sum%=1_000_000_007;
        }
        return (int)sum;
    }
}