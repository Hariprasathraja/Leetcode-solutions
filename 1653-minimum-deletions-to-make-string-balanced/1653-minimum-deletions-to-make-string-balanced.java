class Solution {
    public int minimumDeletions(String s) {
        int deletions=0, count=0;
        for(char i: s.toCharArray()){
            if(i=='b') count++;
            else if(count!=0){
                deletions++;
                count--;
            }
        }
        return deletions;
    }
}