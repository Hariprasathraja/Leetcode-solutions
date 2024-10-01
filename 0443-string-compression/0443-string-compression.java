class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int count=1;
        char cur=chars[0];
        sb.append(cur);
        for(int i=1;i<chars.length;i++){
            if(chars[i]==cur) count++;
            else{
                if(count!=1)sb.append(count);
                cur=chars[i];
                sb.append(cur);
                count=1;
            }
        }
        if(count!=1)sb.append(count);
        String res=sb.toString();
        for(int i=0;i<res.length();i++){
            chars[i]=res.charAt(i);
        }
        return res.length();
    }
}