class Solution {
    public boolean isPerfectSquare(int n) {
    long l=1,h=n;
        while (l<=h) {
            long mid = (l+h) / 2;
            if (mid*mid==n){
                return true;
            }
            if (mid*mid<n) {
                l=mid+1;
            } else {
                h=mid-1;
            }
        }
        return false;
    }
}