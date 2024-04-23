class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    HashMap<String,Integer>map=new HashMap<>();
    List<String>common=new ArrayList<>();
    int minsum=Integer.MAX_VALUE;
    for(int i=0;i<list1.length;i++){
        map.put(list1[i],i);
    }
    for(int i=0;i<list2.length;i++){
        String st=list2[i];
        if(map.containsKey(st)){
            int sum=map.get(st)+i;
            if (sum<minsum) {
                minsum=sum;
                common=new ArrayList();
            }
            if(sum==minsum){
                common.add(st);
            }
        }
    }
    return common.toArray(new String[common.size()]);
    }
}