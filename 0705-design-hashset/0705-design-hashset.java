class MyHashSet {
    boolean[] ar;
    public MyHashSet() {
        ar=new boolean[1000001];
    }
    
    public void add(int key) {
        ar[key]=true;
    }
    
    public void remove(int key) {
        ar[key]=false;
    }
    
    public boolean contains(int key) {
        return ar[key]==true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */