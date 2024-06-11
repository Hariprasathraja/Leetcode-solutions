class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int indx=0;
        for(int i:arr2){
            int count=map.get(i);
            for(int j=0;j<count;j++){
                arr1[indx++]=i;
            }
            map.remove(i);
        }
        for(int i:map.keySet()){
            int count=map.get(i);
            for(int j=0;j<count;j++) {
                list.add(i);
            }
        }
        Collections.sort(list);
        for(int i:list){
            arr1[indx++]=i;
        }
        return arr1;
    }
}