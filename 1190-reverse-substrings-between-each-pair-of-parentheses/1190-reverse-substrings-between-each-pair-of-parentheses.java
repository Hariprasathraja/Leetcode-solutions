class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')'){
                String str="";
                while(st.peek()!='('){
                    str+=st.pop();
                }
                st.pop();
                int i=0;
                while(i<str.length()){
                    st.push(str.charAt(i++));
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