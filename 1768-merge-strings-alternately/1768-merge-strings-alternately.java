class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length(), len2=word2.length();
        StringBuilder sb=new StringBuilder();
        
        int i=0;
        for(i=0;i<Math.min(len1,len2);i++){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if(len1!=len2){
            String temp=len1>len2?word1:word2;
            sb.append(temp.substring(i));
        }
        return sb.toString();
    }
}