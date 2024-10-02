class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone=arr.clone();
        Arrays.sort(clone);
        Map<Integer,Integer> map=new HashMap<>();
        int j=1;
        for(int i=0;i<clone.length;i++){
            if(!map.containsKey(clone[i])){
                map.put(clone[i],i+j);
            }else j--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}