class Solution {
    public long minEnd(int n, int x) {
        long last=x;
        while(--n>0){
            last=(last+1)|x;
        }
        return last;
    }
}