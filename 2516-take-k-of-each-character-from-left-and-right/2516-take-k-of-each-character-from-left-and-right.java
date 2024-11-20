class Solution {
    public int takeCharacters(String s, int k) {
        int[] freq=new int[3];
        for(char i: s.toCharArray()){
            freq[i-'a']++;
        }
        int n=s.length();
        if(freq[0]<k || freq[1]<k || freq[2]<k) return -1; 
        
        int left=0, res=Integer.MAX_VALUE;
        
        for(int right=0; right<n; right++){
           
            freq[s.charAt(right)-'a']--;
            
            while(freq[0]<k || freq[1]<k || freq[2]<k){
                freq[s.charAt(left)-'a']++;
                left++;
            }
            res=Math.min(res,left+(n-right-1));
        }
        return res;
    }
}