class Solution {
    public int[] shortestToChar(String s, char c) {
        int len=s.length(),pos=-len;
        int[] ar=new int[len];
        for(int i=0;i<len;i++){
            if(s.charAt(i)==c) pos=i;
            ar[i]=i-pos;
        }
        for(int i=pos-1;i>-1;i--){
            if(s.charAt(i)==c) pos=i;
            ar[i]=Math.min(ar[i],pos-i);
        }
        return ar;
    }
}

