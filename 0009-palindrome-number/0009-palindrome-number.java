class Solution {
    public boolean isPalindrome(int x) {
        String st=String.valueOf(x);
        if(st.isEmpty()){
            return false;
        }else if(st.matches(".*[+-].*")){
            return false;
        }else{
            int start=0;
            int end=st.length()-1;
            while(start<=end){
                if(st.charAt(start)!=st.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}