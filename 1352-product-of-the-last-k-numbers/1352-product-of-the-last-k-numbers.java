class ProductOfNumbers {
    List<Integer> list;
    int prev;
    public ProductOfNumbers() {
        list=new ArrayList<>();
        list.add(1);
        prev=1;
    }
    
    public void add(int num) {
        if(num>0){
            prev*=num;
            list.add(prev);
        }else{
            list.clear();
            list.add(1);
            prev=1;
        }
    }
    
    public int getProduct(int k) {
        return (k<list.size())?prev/list.get(list.size()-1-k):0;
    }
}

