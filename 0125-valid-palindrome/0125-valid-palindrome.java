class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
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