class Solution {
    public boolean isHappy(int n) {
    if(n<10){
        if(n==1||n==7){
            return true;
        }
        return false;
    }
    int sum=0;
    while(n>0){
        int dig=n%10;
        sum+=dig*dig;
        n/=10;
    }
    return isHappy(sum);
    }
}