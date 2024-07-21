class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> rowOrder = topological(rowConditions, k);
        List<Integer> colOrder = topological(colConditions, k);
        
        if (rowOrder.size() < k || colOrder.size() < k) return new int[0][0];

        Map<Integer, Integer> rowIndexMap = new HashMap<>();
        Map<Integer, Integer> colIndexMap = new HashMap<>();
        
        for (int i = 0; i < k; i++) {
            rowIndexMap.put(rowOrder.get(i), i);
            colIndexMap.put(colOrder.get(i), i);
        }
        
        int[][] ans = new int[k][k];
        
        for (int i = 0; i < k; i++) {
            int row = rowIndexMap.get(i + 1);
            int col = colIndexMap.get(i + 1);
            ans[row][col] = i + 1;
        }
        
        return ans;
    }

    private List<Integer> topological(int[][] conditions, int k) {
        int[] indegree = new int[k];
        List<Integer> order = new ArrayList<>();
        List<Integer>[] graph = new ArrayList[k];
        
        for (int i = 0; i < k; i++) graph[i] = new ArrayList<>();
        
        for (int[] condition : conditions) {
            int u = condition[0] - 1;
            int v = condition[1] - 1;
            graph[u].add(v);
            indegree[v]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (indegree[i] == 0) queue.add(i);
        }
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node + 1);
            for (int neighbor : graph[node]) {
                if (--indegree[neighbor] == 0) queue.add(neighbor);
            }
        }
        
        return order;
    }
}







/*class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> rowOrder = topological(rowConditions, k);
        List<Integer> colOrder = topological(colConditions, k);
        if (rowOrder.size() < k || colOrder.size() < k) return new int[0][0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) map.put(colOrder.get(i), i);
        int[][] ans = new int[k][k];
        for (int i = 0; i < k; i++) ans[i][map.get(rowOrder.get(i))] = rowOrder.get(i);
        return ans;
    }
    private List<Integer> topological(int[][] ar,int k){
        int[] indegree= new int[k];
        List<Integer> order=new ArrayList<>();
        List<Integer>[] graph=new ArrayList[k];
        for(int i=0;i<k;i++) graph[i]=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        for(int[] i: ar){
            int u=i[1]-1;
            int v=i[0]-1;
            graph[u].add(v);
            indegree[v]++;
        }
        for(int i=0;i<k;i++){
            if(indegree[i]==0) queue.add(i);
        }
        
        while(!queue.isEmpty()){
            int v=queue.poll();
            order.add(v+1);
            for(int i: graph[v]){
                if(--indegree[i]==0) queue.add(i);
            }
        }
        return order;
    }
}
*/