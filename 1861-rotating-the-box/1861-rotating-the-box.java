class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row=box.length, col=box[0].length;
        char[][] rotated=new char[col][row];
        
        for(int i=0;i<row;i++){
            int right=col-1;
            
            for(int j=col-1;j>-1;j--){
                
                char c=box[i][j];
                if(c=='*'){
                    right=j-1;
                }else if(c=='#'){
                    box[i][j]='.';
                    box[i][right]='#';
                    right--;
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                rotated[j][row-i-1]=box[i][j];
            }
        }
        return rotated;
    }
}