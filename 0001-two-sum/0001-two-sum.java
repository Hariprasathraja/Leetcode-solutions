class Solution {
    public int[] twoSum(int[] n, int target) {
        int i=0,j=1;
        while(i<n.length-1){
            int comp=target-n[i];
            while(j<n.length){
                if(n[j]==comp){
                    return new int[]{i,j}; 
                }
                j++;
            }
            i++;
            j=i+1;
        }
        return null;
    }
}