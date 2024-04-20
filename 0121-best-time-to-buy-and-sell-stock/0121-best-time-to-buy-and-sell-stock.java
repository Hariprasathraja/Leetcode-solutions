class Solution {
    public int maxProfit(int[] prices) {
    int MIN=Integer.MAX_VALUE,MAX=0;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<MIN){
            MIN=prices[i];
        }else{
            MAX=Math.max(MAX,prices[i]-MIN);
        }
    }    
    return MAX;
    }
}