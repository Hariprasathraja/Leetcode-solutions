class Solution {
    public int minimizedStringLength(String s) {
    int[] ar=new int[26];
    for(char i:s.toCharArray()){
        ar[i-'a']++;
    }
   int len=0;
    for(int i:ar){
        if(i!=0){
        len++;
    }
    }
    return len;
    }
}