class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase();
        st=st.replaceAll("[^a-z\\d]","");
        StringBuilder sb=new StringBuilder(st);
        sb.reverse();
        if(st.equals(sb.toString())){
            return true;
        }
        return false;   
    }
}