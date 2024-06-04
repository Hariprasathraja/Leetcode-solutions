class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int row=m,col=n;
        for(int[] i: ops){
            row=Math.min(row,i[0]);
            col=Math.min(col,i[1]);
        }
        return row*col;
    }
}