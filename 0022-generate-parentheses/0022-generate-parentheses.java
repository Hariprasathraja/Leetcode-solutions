class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        if(n>0) Generateparenthesis("",list,n,n);
        return list;
    }
    private void Generateparenthesis(String prefix,List<String>list,int left,int right){
        if(left==0 && right==0) list.add(prefix);
        if(left>0){
            Generateparenthesis(prefix+"(",list,left-1,right);
        }
        if(left<right){
            Generateparenthesis(prefix+")",list,left,right-1);
        }
    }
}