class Solution {
    public long maxKelements(int[] nums, int k) {
        Queue<Integer> maxheap=new PriorityQueue<>((a,b)->b-a);
        for(int i:nums){
            maxheap.offer(i);
        }
        long res=0;
        while(k>0){
            int num=maxheap.poll();
            res+=num;
            maxheap.offer((num+2)/3);
            k--;
        }
        return res;
    }
}