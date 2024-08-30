class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> graph=new HashMap<>();
        
        for(int i=1;i<=n;i++) graph.put(i,new ArrayList<>());
        
        for(int i=0;i<times.length;i++){
            int u=times[i][0], v=times[i][1], w=times[i][2];
            graph.get(u).add(new int[]{v,w});
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        
        Queue<int[]> minHeap=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        minHeap.offer(new int[]{k,0});
        
        while(!minHeap.isEmpty()){
            int[] edge=minHeap.poll();
            int node=edge[0];
            int time=edge[1];
            
            if(time>dist[node]) continue;
            
            for(int[] neighbour: graph.get(node)){
                int nextNode=neighbour[0];
                int newTime=neighbour[1]+time;
                
                if(newTime<dist[nextNode]){
                    dist[nextNode]=newTime;
                    minHeap.offer(new int[]{nextNode,newTime});
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(dist[i],max);
        }
        return max;
    }
}