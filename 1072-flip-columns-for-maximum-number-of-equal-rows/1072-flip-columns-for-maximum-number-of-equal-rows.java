class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String,Integer> map= new HashMap<>();
        
        for(int[] row: matrix){
            StringBuilder sb=new StringBuilder();
            int flip= row[0]==0? 0:1;
            
            for(int j: row){
                sb.append(j^flip);
            }
            String s=sb.toString();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int res=0;
        for(int count: map.values()){
            res=Math.max(res, count);
        }
        return res;
    }
}