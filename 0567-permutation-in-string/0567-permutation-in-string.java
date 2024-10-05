class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1=s1.length(), len2=s2.length();
        if(len1>len2) return false;
        int[] arr=new int[26];
        for(char c:s1.toCharArray()){
            arr[c-'a']++;
        }
        
        int i=0, j=0, counter=len1;
        while(j<len1){
            if(arr[s2.charAt(j++)-'a']-- >0){
                counter--;
            }
        }
        while(j<len2 && counter!=0){
            if(arr[s2.charAt(i++)-'a']++ >=0) counter++;
            if(arr[s2.charAt(j++)-'a']-- >0) counter--;
        }
        return counter==0;
    }
}
