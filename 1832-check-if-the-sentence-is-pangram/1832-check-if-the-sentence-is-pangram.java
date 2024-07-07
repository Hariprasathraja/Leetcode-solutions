class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        Set<Character> set=new HashSet<>();
        for(char i:sentence.toCharArray()){
            set.add(i);
        }
        return set.size()==26 ?true:false;
    }
}