class Solution {
    public int findComplement(int n) {
        int numBits = 0;
        int temp = n;
        while(temp>0){
            numBits++;
            temp>>=1;
        }
        int mask=(1<<numBits)-1;
        return n^mask;
    }
}
