class Solution {
    public String reverseWords(String s) {
    String[] st=s.split(" ");
    StringBuilder sb=new StringBuilder();
    for(String i:st){
        sb.append(rev(i)).append(" ");
    }
        return sb.toString().trim();
    }
    public String rev(String s) {
        char[] chars=s.toCharArray();
        int start=0,end=s.length()-1;
        while(start<end){
            char temp=chars[end];
            chars[end]=chars[start];
            chars[start]=temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}