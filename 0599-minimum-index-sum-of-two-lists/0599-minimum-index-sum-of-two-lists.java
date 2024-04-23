class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    HashMap<String,Integer>map=new HashMap<>();
    List<String>common=new ArrayList<>();
    int minsum=Integer.MAX_VALUE;
    for(int i=0;i<list1.length;i++){
        map.put(list1[i],i);
    }
    for(int i=0;i<list2.length;i++){
        if(map.containsKey(list2[i])){
            int sum=map.get(list2[i])+i;
            if (sum<minsum) {
                minsum=sum;
                common.clear();
                common.add(list2[i]);
            }else if(sum==minsum){
                common.add(list2[i]);
            }
        }
    }
    return common.toArray(new String[common.size()]);
    }
}