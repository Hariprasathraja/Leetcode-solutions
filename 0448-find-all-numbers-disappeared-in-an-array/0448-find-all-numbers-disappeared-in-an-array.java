class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] checker=new boolean[nums.length+1];
        for(int i:nums) {
            checker[i]=true;
        }
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!checker[i]){
                list.add(i);
            }
        }
        return list;
    }
}