class Solution {
    public long minimumSteps(String s) {
        long res=0;
        int oneCount=0;
        for(char i:s.toCharArray()){
            if(i=='1') oneCount++;
            else{
                if(oneCount>0){
                    res+=oneCount;
                }
            }
        }
        return res;
    }
}