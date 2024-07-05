class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length, c=matrix[0].length;
        if(r==c){
            inplace(matrix,r);
            return matrix;
        }
        int[][] res=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    }
    public void inplace(int[][] matrix,int r){
        for(int i=0;i<r;i++){
            for(int j=i;j<r;j++){
                int tem=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tem;
            }
        }
    }
}