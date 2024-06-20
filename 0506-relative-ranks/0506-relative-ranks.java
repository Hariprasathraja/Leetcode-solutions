class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<Integer> maxheap=new PriorityQueue<>((x,y)-> score[y]-score[x]);
        for(int i=0;i<score.length;i++){
            maxheap.add(i);
        }
        String[] rank=new String[score.length];
        if(!maxheap.isEmpty()) rank[maxheap.poll()]="Gold Medal";
        if(!maxheap.isEmpty()) rank[maxheap.poll()]="Silver Medal";
        if(!maxheap.isEmpty()) rank[maxheap.poll()]="Bronze Medal";
        int i=4;
        while(!maxheap.isEmpty()){
            rank[maxheap.poll()]=String.valueOf(i);
            i++;
        }
        return rank;
    }
}