class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars=s.toCharArray();
        int start=0,end=s.length()-1;
        while (start<=end) {
            if (Character.isLetter(chars[start]) && Character.isLetter(chars[end])) {
                char temp=chars[start];
                chars[start]=chars[end];
                chars[end]=temp;
                start++;
                end--;
            }else if(!Character.isLetter(chars[start])) {
                start++;
            }else if(!Character.isLetter(chars[end])) {
                end--;
            }
        }
        return new String(chars);
    }
}
