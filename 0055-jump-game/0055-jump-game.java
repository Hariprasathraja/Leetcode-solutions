class Solution {
    public boolean canJump(int[] n) {
       int l=n.length-1;
       int jump=l;
       for(int i=l-1;i>-1;i--){
           if(i+n[i]>=jump){
               jump=i;
           }
       }
        return jump==0?true:false;
    }
}