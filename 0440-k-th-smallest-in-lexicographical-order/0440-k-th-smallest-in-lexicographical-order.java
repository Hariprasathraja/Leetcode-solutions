/*class Solution {
    public int findKthNumber(int n, int k) {
        int cur=1,ind=1;
        while(ind<k){
            ind++;
            int steps=count(cur,n);
            if(ind+steps<=k){
                cur+=1;
                ind+=steps;
            }else{
                cur*=10;
                ind+=1;
            }
        }
        return cur;
    }
    public int count(int cur,int n){
        int res=0;
        int nei=cur+1;
        while(cur<=n){
            res=res+(Math.min(nei,n+1))-cur;
            cur*=10;
            nei*=10;
        }
        return res;
    }
}*/
class Solution {
    public int findKthNumber(int n, int k) {
        long cur = 1;
        while(k > 1) {
            long gap = findGap(cur, cur + 1, n);
            if(gap <= k - 1) {
                k -= gap;
                cur = cur + 1;
            }
            else {
                cur = cur * 10;
                k -= 1;
            }
        }

        return (int)cur;
    }
    
    private long findGap(long a, long b, int n) {
        long gap = 0;
        while(a <= n) {
            gap += Math.min(n + 1, b) - a;
            a = a * 10;
            b = b * 10;
        }
        return gap;
    }
}