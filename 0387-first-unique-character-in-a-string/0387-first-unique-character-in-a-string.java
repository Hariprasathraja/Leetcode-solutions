class Solution {
    public int firstUniqChar(String s){
        for(char i:s.toCharArray()){
            int ind=s.indexOf(i);
            if(ind==s.lastIndexOf(i)){
                return ind;
            }
        }
        return -1;
    }
}