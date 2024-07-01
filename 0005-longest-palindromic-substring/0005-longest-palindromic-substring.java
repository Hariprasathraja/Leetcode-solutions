class Solution {
    int start=0,end=0;
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        char[] ar=s.toCharArray();
        for(int i=0;i<ar.length;i++){
            expand(ar,i,i);
            expand(ar,i,i+1);
        }
        return s.substring(start,start+end);
    }
    private void expand(char[] ar,int x,int y){
        while(x>=0 && y<ar.length && ar[x]==ar[y]){
            x--;
            y++;
        }
        if(end<y-x-1){
            end=y-x-1;
            start=x+1;;
        }
    }
}