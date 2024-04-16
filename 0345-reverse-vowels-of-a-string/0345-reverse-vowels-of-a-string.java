class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int h=s.length()-1;
        while(l<=h){
            if(!(Character.toString(arr[l])).matches(".*[aeiouAEIOU].*")){
                l++;
            }else if(!(Character.toString(arr[h])).matches(".*[aeiouAEIOU].*")){
                h--;
            }else{
                char c=arr[l];
                arr[l]=arr[h];
                arr[h]=c;
                l++;
                h--;
            }
        }
        return new String(arr);
    }
}