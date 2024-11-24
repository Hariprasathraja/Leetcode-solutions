class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int negCount=0, min=Integer.MAX_VALUE;
        
        for(int[] i: matrix){
            for(int j: i){
                int abs=j<0?j*-1:j;
                sum+=abs;
                if(j<0) negCount++;
                min=Math.min(min,abs);
            }
        }
        
        if(negCount%2==1){
            sum-=(2*min);
        }
        return sum;
    }
}