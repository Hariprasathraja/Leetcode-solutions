class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        int[][] result=new int[rows*cols][2];
        
        int r=rStart, c=cStart, direct=0, indx=0, steps=1;
        
        result[indx++]=new int[]{r,c};
        
        while(indx<rows*cols){
            for(int x=0;x<2;x++){
                for(int y=0;y<steps;y++){
                    r+=directions[direct][0];
                    c+=directions[direct][1];
                    if(r>=0 && r<rows && c>=0 && c<cols){
                        result[indx++]=new int[]{r,c};
                    }
                }
                direct=(direct+1)%4;
            }
            steps++;
        }
        return result;
    }
}