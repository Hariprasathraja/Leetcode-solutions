class Solution {
    public boolean isCircularSentence(String sent) {
        String[] ar=sent.split(" ");
        for(int i=0;i<ar.length-1;i++){
            String cur=ar[i];
            String next=ar[i+1];
            if(cur.charAt(cur.length()-1)!=next.charAt(0)) return false;
        }
        return (sent.charAt(0)==sent.charAt(sent.length()-1));
    }
}