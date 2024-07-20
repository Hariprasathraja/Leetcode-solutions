class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rowCount=rowSum.length, colCount=colSum.length;
        int[] currentRow=new int[rowCount];
        int[] currentCol=new int[colCount];
        int[][] res=new int[rowCount][colCount];
        
        for(int r=0;r<rowCount;r++){
            for(int c=0;c<colCount;c++){
                int element=Math.min((rowSum[r]-currentRow[r]),(colSum[c]-currentCol[c]));
                res[r][c]=element;
                
                currentRow[r]+=element;
                currentCol[c]+=element;
            }
        }
        return res;
    }
}

 