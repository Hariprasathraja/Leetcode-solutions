class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()<sentence2.length()) return helper(sentence1,sentence2);
        else return helper(sentence2,sentence1);
    }
    public boolean helper(String a, String b){
        String[] ar1=a.split(" ");
        String[] ar2=b.split(" ");
        int l1=0, r1=ar1.length-1, l2=0, r2=ar2.length-1;
        while(l1<=r1 && ar1[l1].equals(ar2[l2])){
            l1++;
            l2++;
        }
            
        while(l1<=r1 && ar1[r1].equals(ar2[r2])){
            r1--;
            r2--;
        }
        return l1>r1;
    }
}