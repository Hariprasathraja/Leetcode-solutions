class MyQueue {
    
    Stack<Integer>In=new Stack<>();
    Stack<Integer>Out=new Stack<>();
    public void push(int x) {
        In.push(x);
    }
    
    public int pop() {
        peek();
        return Out.pop();
    }
    
    public int peek() {
        if(Out.isEmpty()){
            while(!In.isEmpty()){
                Out.push(In.pop());
            }
        }
        return Out.peek();
    }
    
    public boolean empty() {
        return In.isEmpty()&&Out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */