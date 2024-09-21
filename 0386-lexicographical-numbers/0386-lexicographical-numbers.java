class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=9 && i<=n;i++){
            dfs(res,i,n);
        }
        return res;
    }
    public void dfs(List<Integer> res, int cur, int n){
        if(cur>n) return;
        res.add(cur);
        
        for(int i=0;i<10;i++){
            dfs(res,cur*10+i,n);
        }
    }
}