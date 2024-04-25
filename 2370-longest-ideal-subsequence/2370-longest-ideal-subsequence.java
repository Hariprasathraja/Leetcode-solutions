class Solution {
    public int longestIdealString(String s, int k) {
    int[] ar=new int[26];
    int len=s.length();
    int res=0;
    for(int i=0;i<len;i++){
        int cur=s.charAt(i)-'a';
        int left=Math.max(0,cur-k);
        int right=Math.min(25,cur+k);
        int longest=0;
        for(int j=left;j<=right;j++){
            longest=Math.max(longest,ar[j]);
        }
        ar[cur]=Math.max(ar[cur],longest+1);
        res=Math.max(res,ar[cur]);
    }
    return res;
    }
}
