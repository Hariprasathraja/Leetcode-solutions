class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')'){
                StringBuilder sb=new StringBuilder();
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
                int i=0;
                while(i<sb.length()){
                    st.push(sb.charAt(i++));
                }
            }else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}