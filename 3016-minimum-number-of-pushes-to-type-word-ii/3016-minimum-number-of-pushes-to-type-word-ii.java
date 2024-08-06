class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(char i: word.toCharArray()){
            arr[i-'a']++;
        }
        Arrays.sort(arr);
        int ans=0;
        int i=25,count=0;
        for(i=25;i>=0;i--){
            if(arr[i]==0) break;
            if(count<8){
                ans+=arr[i];
            }else if(count<16){
                ans+=arr[i]*2;
            }else if(count<24){
                ans+=arr[i]*3;
            }else{
                ans+=arr[i]*4;
            }
            count++;
        }
        return ans;
    }
}