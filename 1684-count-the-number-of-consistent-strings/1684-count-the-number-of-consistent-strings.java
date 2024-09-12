class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean[] arr=new boolean[26];
        for(char i:allowed.toCharArray()){
            arr[i-'a']=true;
        }
        for(String i:words){
            boolean b=true;
            for(char c:i.toCharArray()){
                if(arr[c-'a']!=true){
                    b=false;
                    break;
                }
            }
            if(b)count++;
        }
        return count;
    }
}