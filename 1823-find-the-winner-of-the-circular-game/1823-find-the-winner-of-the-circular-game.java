class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        while(queue.size()>1){
            int find=k-1;
            while(find>0){
                queue.offer(queue.remove());
                find--;
            }
            queue.remove();
        }
        return queue.poll();
    }
}