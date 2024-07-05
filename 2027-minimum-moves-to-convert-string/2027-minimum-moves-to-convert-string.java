class Solution {
    public int minimumMoves(String s) {
        int c=0,i=0;
        char[] ar=s.toCharArray();
        while(i<ar.length){
            if(ar[i]=='X'){
                c++;
                i+=3;
            }else i++;
        }
        return c;
    }
}