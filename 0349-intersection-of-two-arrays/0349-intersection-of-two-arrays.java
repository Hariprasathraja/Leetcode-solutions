class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>list=new ArrayList<>();
        for(int i:nums2){
            if(map.containsKey(i)){
                list.add(i);
                map.remove(i);
            }
        }
        int[] ar=new int[list.size()];
        int j=0;
        for(int i:list){
            ar[j]=i;
            j++;
        }
        return ar;
    }
}