class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>-1;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }else digits[i]=0;
        }
        if(digits[0]==0){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            return arr;
        }
        return digits;
    }
}