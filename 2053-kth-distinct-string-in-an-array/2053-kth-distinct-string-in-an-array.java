class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(String i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i:arr){
            if(map.get(i)==1) list.add(i);
        }
        if(k>list.size()) return "";
        else{
            return list.get(k-1);
        }
    }
}