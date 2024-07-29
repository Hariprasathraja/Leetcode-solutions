class Solution {
    public int numTeams(int[] rating) {
        int res=0;
        int len=rating.length;
        for(int m=1;m<len-1;m++){
            int left_small=0, right_big=0;
            int left_big=0, right_small=0;
            for(int i=0;i<m;i++){
                if(rating[i]<rating[m]) left_small++;
                else left_big++;
            }
            for(int i=m+1;i<len;i++){
                if(rating[i]>rating[m]) right_big++;
                else right_small++;
            }
            
            res += left_small*right_big;
            res += left_big*right_small;
        }
        return res;
    }
}