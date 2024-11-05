class Solution {
    public int minChanges(String s) {
        int count=0;
        for(int i=0;i<s.length();i+=2){
            count+=helper(s.substring(i,i+2));     
        }
        return count;
    }
    public int helper(String st){
        if(!st.contains("0") || !st.contains("1")) return 0;
        else return 1;
    }
}