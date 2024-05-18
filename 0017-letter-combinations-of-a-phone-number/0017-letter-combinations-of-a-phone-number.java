class Solution {
    private List<String>list=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
         if(digits.length()==0) return list;
         String[] phone={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         backtrack("",digits,phone,list);
         return list;
    }
    private void backtrack(String comb,String dig,String[] dial,List<String> list){
        if(dig.isEmpty()) list.add(comb);
        else{
            char[] num=dial[dig.charAt(0)-'2'].toCharArray();
            for(char i:num){
                backtrack(comb+i,dig.substring(1),dial,list);
            }
        }
    }
}