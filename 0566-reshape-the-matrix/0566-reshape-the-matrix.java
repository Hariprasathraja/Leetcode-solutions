class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length,col=mat[0].length;
        if(row*col!=r*c) return mat;
        int[][] ar=new int[r][c];
        for(int i=0;i<r*c;i++){
            ar[i/c][i%c]=mat[i/col][i%col];
        }
        return ar;
    }
}
