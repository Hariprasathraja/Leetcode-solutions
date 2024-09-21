class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res=new ArrayList<>();
        int cur=1;
        while(res.size()<n){
            res.add(cur);
            if(cur*10<=n) cur*=10;
            else{
                while(cur==n || cur%10==9){
                    cur/=10;
                }
                cur+=1;
            }
        }
        return res;
    }
    /*
    public void dfs(List<Integer> res, int cur, int n){
        if(cur>n) return;
        res.add(cur);
        
        for(int i=0;i<=9;i++){
            int next=cur*10+i;
            
            if(next<=n) dfs(res,next,n);
            else break;
        }
    }
    */
}