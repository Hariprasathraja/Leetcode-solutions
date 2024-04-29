class DataStream {
    int K,val,res;
    public DataStream(int value, int k) {
            val=value;
            K=k;   
            res=0;
    }
    
    public boolean consec(int num) {
        res=(num==val)?res+1:0;
        return res>=K;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */