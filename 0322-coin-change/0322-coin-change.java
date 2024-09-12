class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int c:coins){
                if(i-c>=0 && dp[i - c] != Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],1+dp[i-c]);
                }
            }
        }
        return dp[amount]!=Integer.MAX_VALUE?dp[amount]: -1;
    }
}