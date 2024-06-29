class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ances=new ArrayList<>();
        Map<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] i:edges){
            int parent=i[0], child=i[1];
            map.get(child).add(parent);
        }
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            addAncestor(map,i,set);
            List<Integer>list=new ArrayList<>(set);
            Collections.sort(list);
            ances.add(list);
        }
        return ances;
    }
    private void addAncestor(Map<Integer,List<Integer>> map,int key,Set<Integer> set){
        for(int parent: map.get(key)){
            if(!set.contains(parent)){
                set.add(parent);
                addAncestor(map,parent,set);
            }
        }
    }
}