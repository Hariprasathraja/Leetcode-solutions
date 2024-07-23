class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Queue<Integer> queue=new PriorityQueue<>((a,b)->{
            if(map.get(a)==map.get(b)){
                return b-a;
            }else{
                return map.get(a)-map.get(b);
            }
        });
        for(int n: map.keySet()){
            queue.offer(n);
        }
        int[] res=new int[nums.length];
        int indx=0;
        while(!queue.isEmpty()){
            int num=queue.poll();
            int count=map.get(num);
            for(int i=0;i<count;i++){
                res[indx++]=num;
            }
        }
        return res;
    }                                         
}