class Solution {
    public String reversePrefix(String word, char ch) {
        int left=0,right=0;
        char[] arr=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                right=i;
                break;
            }
        }
        while(left<right){
            char temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}