class Solution {
    public int maximumSwap(int num) {
        char[] ar=Integer.toString(num).toCharArray();
        char max='0';
        int ind=-1, swapMinInd=-1, swapMaxInd=-1;
        for(int i=ar.length-1;i>=0;i--){
            if(ar[i]>max){
                max=ar[i];
                ind=i;
            }
            if(ar[i]<max){
                swapMinInd=i;
                swapMaxInd=ind;
            }
        }
        if(swapMinInd!=-1){
            char tem=ar[swapMinInd];
            ar[swapMinInd]=ar[swapMaxInd];
            ar[swapMaxInd]=tem;
        }
        
        return Integer.parseInt(new String(ar));
    }
}