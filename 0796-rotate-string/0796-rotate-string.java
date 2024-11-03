/*class Solution {
    public boolean rotateString(String s, String goal) {
        int len=goal.length();
        while(len>0){
            s=s.charAt(s.length()-1)+s.substring(0,s.length()-1);
            if(s.equals(goal)) return true;
            len--;
        }
        return false;
    }
}*/
class Solution{
    public boolean rotateString(String s, String goal){
        if(s.length()!=goal.length()) return false;
        
        String st=s+s;
        if(st.contains(goal)) return true;
        
        return false;
    }
}