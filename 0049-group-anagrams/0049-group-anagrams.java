class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s: strs){
            char[] ar=s.toCharArray();
            Arrays.sort(ar);
            String st=new String(ar);
            if(map.containsKey(st)){
                map.get(st).add(s);
            }else{
                map.put(st,new ArrayList<>());
                map.get(st).add(s);
            }
        }
        return new ArrayList(map.values());
    }
}