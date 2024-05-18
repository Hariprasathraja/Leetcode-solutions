class Solution {
    public String reverseStr(String s, int k) {
    char[] arr=s.toCharArray();
    int start=0,end=s.length();
    while(start<end){
        int j=Math.min(start+k-1,end-1);
        reverse(arr,start,j);
        start+=2*k;
    } 
    return String.valueOf(arr);
    }
    public void reverse(char[] arr,int low,int high){
       while(low<high){
            char temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
    }
}