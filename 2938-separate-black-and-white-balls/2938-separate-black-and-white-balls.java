class Solution {
    public long minimumSteps(String s) {
        long res=0;
        int oneCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') oneCount++;
            else{
                if(oneCount>0){
                    res+=oneCount;
                }
            }
        }
        return res;
    }
}