class Solution {
    public int firstUniqChar(String s){
        for(char i:s.toCharArray()){
            if(s.indexOf(i)==s.lastIndexOf(i)){
                return s.indexOf(i);
            }
        }
        return -1;
    }
}