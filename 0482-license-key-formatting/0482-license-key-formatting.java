class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=s.length()-1;i>-1;i--){
            char ch=s.charAt(i);
            if(ch!='-'){
                if(c==k){
                    sb.append('-');
                    c=0;
                }
                sb.append(Character.toUpperCase(ch));
                c++;
            }
        }
        return sb.reverse().toString();
    }
}