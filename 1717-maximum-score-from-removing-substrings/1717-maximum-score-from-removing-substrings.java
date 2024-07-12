class Solution {
    public int maximumGain(String s, int x, int y) {
        int high=Math.max(x,y) ,low=Math.min(x,y);
        char start=(x>y)?'a':'b' ,end=(x>y)?'b':'a';
        Stack<Character> st=new Stack<>();
        int gain=0;
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==start && c==end){
                st.pop();
                gain+=high;
            }else{
                st.push(c);
            }
        }
        Stack<Character> remain=new Stack<>();
        while(!st.isEmpty()){
            char c=st.pop();
            if(!remain.isEmpty() && remain.peek()==start && c==end){
                remain.pop();
                gain+=low;
            }else{
                remain.push(c);
            }
        }
        return gain;
    }
}
