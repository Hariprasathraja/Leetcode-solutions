class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> maxheap=new PriorityQueue<>((a,b)-> b-a);
        for(int i:gifts){
            maxheap.offer(i);
        }
        while(k>0){
            int element=maxheap.poll();
            maxheap.offer((int)Math.sqrt(element));
            k--;
        }
        long res=0;
        while(!maxheap.isEmpty()){
            res+=maxheap.poll();
        }
        return res;
    }
}