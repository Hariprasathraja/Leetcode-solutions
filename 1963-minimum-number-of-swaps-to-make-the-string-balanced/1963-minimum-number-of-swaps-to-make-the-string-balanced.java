class Solution {
    public int minSwaps(String s) {
        int imbalance=0, max=0;
        for(char c: s.toCharArray()){
            if(c=='['){
                imbalance--;
            }else imbalance++;
            
            max=Math.max(max,imbalance);
        }
        return (max+1)/2;
    }
}