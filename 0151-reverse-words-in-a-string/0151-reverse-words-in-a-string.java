class Solution {
    public String reverseWords(String s) {
        String[] st=s.trim().split("\\s+");
        reverse(0,st.length-1,st);
        
        return String.join(" ",st);
    
    }    
    
    private void reverse(int l,int h,String[] ar){
        while(l<=h){
            String t=ar[l];
            ar[l++]=ar[h];
            ar[h--]=t;
        }
    }
}