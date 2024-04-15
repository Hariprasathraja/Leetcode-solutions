class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(str);
        String st=str[0];
        String en=str[str.length-1];
        for(int i=0;i<Math.min(st.length(),en.length());i++){
            if(st.charAt(i)!=en.charAt(i)){
                return sb.toString();
            }
            sb.append(st.charAt(i));
        }
        return sb.toString();
    }
}