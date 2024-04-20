class Solution {
    public int climbStairs(int n) {
    if(n<4){
        return n;
    }
    int a=2,b=3,c=0;
    for(int i=3;i<n;i++){
        c=a+b;
        a=b;
        b=c;
    }
    return c;
    }
}