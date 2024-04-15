class Solution {
    public int searchInsert(int[] n, int t) {
       int l=0;
       int h=n.length-1;
       while(l<=h){
           int mid=l+(h-l)/2;
           if(n[mid]==t){
               return mid;
           }else if(n[mid]<t){
               l=mid+1;
           }else{
               h=mid-1;
           }
       }
    return l;
    }
}