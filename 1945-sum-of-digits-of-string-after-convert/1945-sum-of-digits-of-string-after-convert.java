class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append((c-'a')+1);
        }
        String cur=sb.toString();
        while(k!=0){
            int sum=0;
            for(char i:cur.toCharArray()){
                sum+=i-'0';
            }
            cur=String.valueOf(sum);
            k--;
        }
        return Integer.parseInt(cur);
    }
}