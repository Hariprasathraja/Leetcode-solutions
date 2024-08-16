class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res=0, cur_min=arrays.get(0).get(0), cur_max=arrays.get(0).get(arrays.get(0).size()-1);
        
        for(int i=1;i<arrays.size();i++){
            List<Integer> l=arrays.get(i);
            int min_val=l.get(0), max_val=l.get(l.size()-1);
            res=Math.max(res,Math.max(Math.abs(cur_max-min_val),Math.abs(max_val-cur_min)));
            
            cur_min=Math.min(cur_min,min_val);
            cur_max=Math.max(cur_max,max_val);
        }
        return res;
    }
}