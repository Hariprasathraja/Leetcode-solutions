class Solution {
    public int isPrefixOfWord(String sentence, String word) {
        String[] ar=sentence.split(" ");
        int ind=1, len=word.length();
        for(String i: ar){
            if(i.length()>=len && i.substring(0,len).equals(word)){
                return ind;
            }
            ind++;
        }
        return -1;
    }
}