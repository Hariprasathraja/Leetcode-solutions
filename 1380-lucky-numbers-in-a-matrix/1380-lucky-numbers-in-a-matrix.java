class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] ar=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int minind=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<matrix[i][minind]){
                    minind=j;
                }
            }
            ar[i]=minind;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int col=ar[i];
            int candidate=matrix[i][col];
            boolean b=true;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][col]>candidate){
                    b=false;
                    break;
                }
            }
            if(b){
                list.add(candidate);
                break;
            }
        }
        return list;
    }
}