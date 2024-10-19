class Solution {
    public char findKthBit(int n, int k){
        return helper(n,k);
    }
    public char helper(int n, int k) {
        if(n==1) return '0';
        
        int length=(1<<n)-1;
        int middle=(length/2)+1;
        
        if(k==middle) return '1';
        else if(k<middle){
            return helper(n-1,k);
        }else{
            int secondHalf=length-k+1;
            char mirroredBit=helper(n-1,secondHalf);
            return invert(mirroredBit);
        }
    }
    public char invert(char c){
        return c=='0'?'1':'0';
    }
}