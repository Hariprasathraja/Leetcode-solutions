class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int i:candies){
            max=Math.max(max,i);
        }
        List<Boolean> res=new ArrayList<>();
        for(int i:candies){
            res.add(i+extraCandies>=max?true:false);
        }
        return res;
    }
}