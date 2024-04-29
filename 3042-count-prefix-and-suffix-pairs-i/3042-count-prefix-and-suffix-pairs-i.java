class Solution {
    public int countPrefixSuffixPairs(String[] words) {
    int count=0;
    for(int i=0;i<words.length;i++){
        for(int j=i+1;j<words.length;j++){
            String s1=words[i], s2=words[j];
            if(s2.length()>=s1.length()){
                if(s1.equals(s2.substring(0,s1.length()))&&s1.equals(s2.substring(s2.length()-s1.length()))){
                    count++;
                }
        }
        }
    }
    return count;
    }
}
