class Solution {
    public int findChampion(int n, int[][] edges) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashSet<>());
        }
        for(int[] i: edges){
            int u=i[0];
            int v=i[1];
            map.get(u).add(v);
        }
        
        for(int i=0;i<n;i++){
            if(map.containsKey(i)){
                Queue<Integer> queue=new LinkedList<>();
                queue.addAll(map.get(i));
                
                while(!queue.isEmpty()){
                    int neighbour=queue.poll();
                    
                    if(map.containsKey(neighbour)){
                        queue.addAll(map.get(neighbour));
                        map.get(i).addAll(map.get(neighbour));
                        map.remove(neighbour);
                    }
                }
            }
        }
        return map.size()>1?-1:map.keySet().iterator().next();
    }
}