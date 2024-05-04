class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] ar1=new int[256];
        int[] ar2=new int[256];
        for(int i=0;i<s.length();i++){
            if(ar1[s.charAt(i)]!= ar2[t.charAt(i)]){
                return false;
            }
            ar1[s.charAt(i)]=ar2[t.charAt(i)]=i+1;
        }
        return true;
    }
}