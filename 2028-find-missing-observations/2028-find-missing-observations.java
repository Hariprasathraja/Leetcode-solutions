class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int totalSum=mean*(m+n);
        int sum=0;
        
        for(int i: rolls) sum+=i;
        
        int missingSum=totalSum-sum;
        
        if(missingSum>6*n || missingSum<n) return new int[0];
        
        int[] res=new int[n];
        int ind=0;
        while(n>0){
            int roll=Math.min(6,missingSum-n+1);
            res[ind++]=roll;
            missingSum-=roll;
            n-=1;
        }
        return res;
    }
}