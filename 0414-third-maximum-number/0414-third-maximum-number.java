class Solution {
    public int thirdMax(int[] nums) {
        Queue<Integer>queue=new PriorityQueue<>();
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                queue.offer(i);
                set.add(i);
                if(queue.size()>3) queue.poll();
            }
        }
        if(queue.size()==2) queue.poll();
        return queue.peek();
    }
}