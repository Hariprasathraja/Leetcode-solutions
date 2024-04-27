class RecentCounter {
    Queue<Integer> queue;
    int len=0;
    public RecentCounter() {
        queue=new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        len++;
        while(queue.peek()<t-3000){
            queue.remove();
            len--;
        }
        return len;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */