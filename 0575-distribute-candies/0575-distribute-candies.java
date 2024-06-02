class Solution {
    public int distributeCandies(int[] candyType) {
        int len=candyType.length/2;
        Set<Integer> set=new HashSet<>();
        for(int i:candyType){
            if(set.size()<len) set.add(i);
            else break;
        }
        return set.size();
    }
}