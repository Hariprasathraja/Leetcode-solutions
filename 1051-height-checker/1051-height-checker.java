class Solution {
    public int heightChecker(int[] arr) {
        int[] dup=arr.clone();
        int count=0;
        Arrays.sort(dup);
        for(int i=0;i<arr.length;i++){
            if(dup[i]!=arr[i]) count++;
        }
        return count;
    }
}