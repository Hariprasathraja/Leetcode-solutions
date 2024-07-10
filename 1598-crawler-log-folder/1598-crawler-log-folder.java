class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(String i: logs){
            if(i.equals("../")){
                count=Math.max(0,--count);
            }else if(i.equals("./")){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}