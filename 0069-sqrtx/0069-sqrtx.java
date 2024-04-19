class Solution {
    public int mySqrt(int x) {
    if(x<2){
        return x;
    }   
    int start=0;
    int end=x;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(mid*mid==x){
            return mid;
        }else if((long)mid*mid<x){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return Math.round(end);
    }
}