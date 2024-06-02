class Solution {
    public int distributeCandies(int[] candyType) {
        int len=0;
        Set<Integer> set=new HashSet<>();
        for(int i:candyType){
            set.add(i);
            len++;
        }
        return set.size()>len/2 ? len/2:set.size();
    }
}