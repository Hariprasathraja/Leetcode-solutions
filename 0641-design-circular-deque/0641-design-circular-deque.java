class MyCircularDeque {
    int[] ar;
    int k,front,rear,size;
    public MyCircularDeque(int k) {
        ar=new int[k];
        this.k=k;
        this.front=0;
        this.rear=0;
        this.size=0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        front=(front-1+k)%k;
        ar[front]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        ar[rear]=value;
        rear=(rear+1)%k;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        front=(front+1)%k;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        rear=(rear-1+k)%k;
        size--;
        return true;
    }
    
    public int getFront() {
        return isEmpty()?-1:ar[front];
    }
    
    public int getRear() {
        return isEmpty()?-1:ar[(rear-1+k)%k];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */