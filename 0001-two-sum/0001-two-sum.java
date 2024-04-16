class Solution {
    public int[] twoSum(int[] n, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n.length;i++){
            map.put(n[i],i);
        }
        for(int i=0;i<n.length;i++){
            int complement=target-n[i];
            if(map.containsKey(complement)&& map.get(complement)!=i){
                return new int[]{i,map.get(complement)};
            }
        }
        return null;
    }
}