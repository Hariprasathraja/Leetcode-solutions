class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        int[] start=new int[n], end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int left=0,right=0;
        int groups=0, res=0;
        while(left<n && right<n){
            if(start[left]<=end[right]){
                left++;
                groups++;
                res=Math.max(res,groups);
            }else{
                right++;
                groups--;
            }
        }
        return res;
    }
}