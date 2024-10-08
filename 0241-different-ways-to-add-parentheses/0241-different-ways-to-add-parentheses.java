class Solution {
    private final Map<String,BiFunction<Integer,Integer,Integer>> map=new HashMap<>();
    public Solution(){
        map.put("+",(a,b)->a+b);
        map.put("-",(a,b)->a-b);
        map.put("*",(a,b)->a*b);
    }
    
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result=new ArrayList<>();
        
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            
            if(c=='+'||c=='-'||c=='*'){
                String left=expression.substring(0,i);
                String right=expression.substring(i+1);
                
                List<Integer> leftside=diffWaysToCompute(left);
                List<Integer> rightside=diffWaysToCompute(right);
                
                for(int l:leftside){
                    for(int r:rightside){
                        result.add(map.get(Character.toString(c)).apply(l,r));
                    }
                }
            }
        }
        if(result.isEmpty()) result.add(Integer.parseInt(expression));
        
        return result;
    }
}