/*class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set=new HashSet<>();
        for(int i:nums) set.add((long)i);
        
        int res=-1;
        Arrays.sort(nums);
        for(int i:nums){
            int count=1;
            long tem=(long)i;
            while(set.contains(tem*tem)){
                count++;
                tem=tem*tem;
                res=Math.max(res,count);
            }
        }
        return res;
    }
}*/
class Solution {
    List<Integer> list=new ArrayList<>();
    public int longestSquareStreak(int[] nums) {
        Set<Long> set=new HashSet<>();
        for(int n:nums)
        {
            set.add((long)n);
        }
        int max=-1;
        for(int n:nums)
        {
            int count=1;
          long num=n;
            while(set.contains(num*num))
            {
                count++;
                num=num*num;
                max=Math.max(max,count);
            }
        }
        return max;
    }
}