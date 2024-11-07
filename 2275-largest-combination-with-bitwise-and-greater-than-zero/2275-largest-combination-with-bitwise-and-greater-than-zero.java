class Solution {
    public int largestCombination(int[] candidates) {
        int[] count=new int[32];
        for(int i: candidates){
            int ind=0;
            while(i>0){
                if((i&1)==1){
                    count[ind]++;
                }
                ind+=1;
                i=i>>1;
            }
        }
        int res=0;
        for(int i:count){
            res=Math.max(i,res);
        }
        return res;
    }
}