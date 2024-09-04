class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        int x=0, y=0, d=0, res=0;
        Set<String> set=new HashSet<>();
        for(int[] i:obstacles){
            set.add(i[0]+","+i[1]);
        }
        
        for(int com :commands){
            if(com==-1){
                d=(d+1)%4;
            }else if(com==-2){
                d=(d+3)%4;
            }else{
                for(int i=0;i<com;i++){
                    int a=x+directions[d][0];
                    int b=y+directions[d][1];
                    String st=a+","+b;
                    if(set.contains(st)){
                        break;
                    }
                    x+=directions[d][0];
                    y+=directions[d][1];
                }
            }
            res=Math.max(res,(x*x)+(y*y));
        }
        return res;
    }
}