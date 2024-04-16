class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int h=s.length()-1;
        while(l<h){
            if(arr[l]!='a'&&arr[l]!='e'&&arr[l]!='i'&&arr[l]!='o'&&arr[l]!='u'&&arr[l]!='A'&&arr[l]!='E'&&arr[l]!='I'&&arr[l]!='O'&&arr[l]!='U'){
                l++;
            }else if(arr[h]!='a'&&arr[h]!='e'&&arr[h]!='i'&&arr[h]!='o'&&arr[h]!='u'&&arr[h]!='A'&&arr[h]!='E'&&arr[h]!='I'&&arr[h]!='O'&&arr[h]!='U'){
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