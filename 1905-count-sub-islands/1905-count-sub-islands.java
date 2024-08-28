class Solution {
    private Set<String> set=new HashSet<>();
    int row, col;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        this.row=grid1.length;
        this.col=grid1[0].length;
        int count=0;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                String point=i+","+j;
                if(grid2[i][j]==1 && !set.contains(point) && dfs(i,j,grid1,grid2)){
                    count++;
                }
            }
        }
        return count;
    }
    
    public boolean dfs(int r, int c,int[][] grid1,int[][] grid2){
        String point=r+","+c;
        if(r<0 || c<0 || r==row || c==col ||grid2[r][c]==0 || set.contains(point)){
            return true;
        }
        
        set.add(point);
        boolean res=true;
        
        if(grid1[r][c]==0) res=false;
        
        res=dfs(r-1,c,grid1,grid2) && res;
        res=dfs(r+1,c,grid1,grid2) && res;
        res=dfs(r,c-1,grid1,grid2) && res;
        res=dfs(r,c+1,grid1,grid2) && res;
        
        return res;
    }
}