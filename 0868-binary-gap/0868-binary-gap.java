class Solution {
    public int binaryGap(int n) {
        int i = -1;
        int maxDis=0;
        for (int j = 0; n > 0; j++) {
            if (n % 2 == 1) {
                if (i != -1) {
                    maxDis=Math.max(maxDis, j - i );
                }
                i=j;
            }
            n /= 2;
        }
    return maxDis;
    }
}