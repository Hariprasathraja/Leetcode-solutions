class Solution {
    public String reverseStr(String s, int k) {
    char[] arr=s.toCharArray();
    for(int i=0;i<arr.length;i+=2*k){
            reverse(arr,i,i+k-1);
    }
    return String.valueOf(arr);
    }
    public void reverse(char[] arr,int low,int high){
       if(high>arr.length-1) high=arr.length-1;
       while(low<high){
            char temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
    }
}