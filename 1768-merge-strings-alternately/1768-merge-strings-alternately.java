class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length(), len2=word2.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<Math.min(len1,len2);i++){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if(len1<len2){
            for(int i=len1;i<len2;i++){
                sb.append(word2.charAt(i));
            }
        }else if(len1>len2){
            for(int i=len2;i<len1;i++){
                sb.append(word1.charAt(i));
            }
        }
        return sb.toString();
    }
}