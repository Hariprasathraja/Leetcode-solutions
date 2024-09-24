class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        if(arr1.length>arr2.length){
            return prefix(arr1,arr2);
        }else{
            return prefix(arr2,arr1);
        }
    }
    
    public int prefix(int[] ar1, int[] ar2){
        Set<Integer> set=new HashSet<>();
        for(int i:ar1){
            while(i>0){
                set.add(i);
                i/=10;
            }
        }
        int len=0;
        for(int i:ar2){
            while(i>0){
                if(set.contains(i)){
                    len=Math.max(len,Integer.toString(i).length());
                    break;
                }
                i/=10;
            }
        }
        return len;
    }
}