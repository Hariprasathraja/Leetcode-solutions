class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb=new StringBuilder();
        int total=a+b+c;
        int contA=0, contB=0, contC=0;
        while(total>0){
            
            if((a>=b && a>=c && contA!=2) || (a>0 && (contB==2 || contC==2))){
                sb.append("a");
                a--;
                contA++;
                contB=contC=0;
            }
            else if((b>=a && b>=c && contB!=2) || (b>0 && (contA==2 || contC==2))){
                sb.append("b");
                b--;
                contB++;
                contA=contC=0;
            }else if((c>=a && c>=b && contC!=2) || (c>0 && (contA==2 || contB==2))){
                sb.append("c");
                c--;
                contC++;
                contA=contB=0;
            }
            total--;
        }
        return sb.toString();
    }
}