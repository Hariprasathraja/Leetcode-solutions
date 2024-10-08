class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String>set=new HashSet<>(Arrays.asList(dictionary));
        int n=s.length();
        int[] dp=new int[n+1];
        Arrays.fill(dp,n);
        dp[0]=0;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(set.contains(s.substring(j,i))){
                    dp[i]=Math.min(dp[i],dp[j]);
                }else{
                    dp[i]=Math.min(dp[i],dp[j]+(i-j));
                }
            }
        }
        return dp[n];
    }
}