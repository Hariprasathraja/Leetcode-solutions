class CustomStack {
    int[] arr;
    int top, maxSize;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        this.top=0;
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(top<maxSize){
            arr[top++]=x;
        }
    }
    
    public int pop() {
        if(top-1==-1) return -1;
        else return arr[--top];
    }
    
    public void increment(int k, int val) {
        int i=0;
        while(i<maxSize && i<k){
            arr[i]+=val;
            i++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */