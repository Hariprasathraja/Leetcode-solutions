class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        Map<Integer,List<double[]>> graph=new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double weight=succProb[i];
            graph.get(u).add(new double[]{v,weight});
            graph.get(v).add(new double[]{u,weight});
        }
            
        double[] maxProb=new double[n];
        maxProb[start_node]=1.0;
        Queue<double[]> maxHeap=new PriorityQueue<>((a,b)->Double.compare(b[1],a[1]));
        maxHeap.offer(new double[]{start_node,1.0});
        
        while(!maxHeap.isEmpty()){
            double[] node=maxHeap.poll();
            int curNode=(int)node[0];
            double curProb=node[1];
            
            if(curNode==end_node) return curProb;
            
            for(double[] neighbour: graph.get(curNode)){
                int nextNode=(int) neighbour[0];
                double nextProb= neighbour[1];
                double newProb= curProb*nextProb;
                
                if(newProb> maxProb[nextNode]){
                    maxProb[nextNode]=newProb;
                    maxHeap.offer(new double[]{nextNode,newProb});
                }
            }
        }
        return 0.0;
    }
}