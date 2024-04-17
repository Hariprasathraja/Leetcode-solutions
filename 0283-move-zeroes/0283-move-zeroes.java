class Solution {
    public void moveZeroes(int[] n) {
      int l=0;
      for(int i=0;i<n.length;i++){
          if(n[l]==0&&n[i]!=0){
              int t=n[i];
              n[i]=n[l];
              n[l]=t;
          }
          if(n[l]!=0){
              l++;
          }
      }
    }
}