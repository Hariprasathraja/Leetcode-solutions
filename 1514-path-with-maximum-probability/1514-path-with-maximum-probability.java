class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        Map<Integer,List<double[]>> graph=new HashMap<>();
        for(int i=0;i<n;i++) graph.put(i,new ArrayList<>());
        
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0], v=edges[i][1];
            double w=succProb[i];
            graph.get(u).add(new double[]{v,w});
            graph.get(v).add(new double[]{u,w});
        }
        
        Queue<double[]> maxHeap=new PriorityQueue<>((a,b)->Double.compare(b[1],a[1]));
        maxHeap.offer(new double[]{start_node,1.0});
        
        double[] allProb=new double[n];
        allProb[start_node]=1.0;
        
        while(!maxHeap.isEmpty()){
            double[] edge=maxHeap.poll();
            int node= (int) edge[0];
            double curProb= edge[1];
            
            if(node==end_node) return curProb;
            
            for(double[] neighbour: graph.get(node)){
                int nextNode=(int) neighbour[0];
                double newProb= curProb * neighbour[1];
                
                if(newProb> allProb[nextNode]){
                    allProb[nextNode]=newProb;
                    maxHeap.offer(new double[]{nextNode,newProb});
                }
            }
        }
        return 0.0;
    }
}