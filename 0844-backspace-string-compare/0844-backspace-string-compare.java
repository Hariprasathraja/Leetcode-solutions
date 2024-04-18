class Solution {
    public boolean backspaceCompare(String s, String t) {
        return Compare(s).equals(Compare(t));
    }
    static String Compare(String st){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='#'&&!stack.isEmpty()){
                stack.pop();
            }else if(st.charAt(i)!='#'){
                stack.push(st.charAt(i));
            }
        }
        return stack.toString();
    }
}