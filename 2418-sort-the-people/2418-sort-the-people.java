class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        Queue<int[]>queue=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<n;i++){
            queue.offer(new int[]{i,heights[i]});
        }
        String[] sorted=new String[n];
        int indx=0;
        while(!queue.isEmpty()){
            sorted[indx++]=names[queue.poll()[0]];
        }
        return sorted;
    }
}