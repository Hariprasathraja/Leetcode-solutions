class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer>map=new HashMap<>();
        String[] ar1=s1.split(" ");
        String[] ar2=s2.split(" ");
        int i=0,j=0;
        while(i<ar1.length || j<ar2.length){
            if(i<ar1.length){
                map.put(ar1[i],map.getOrDefault(ar1[i],0)+1);
                i++;
            }
           if(j<ar2.length){
               map.put(ar2[j],map.getOrDefault(ar2[j],0)+1);
               j++;  
            }
        }
        List<String> res=new ArrayList<>();
        for(Map.Entry<String,Integer> ent:map.entrySet()){
            if(ent.getValue()==1){
                res.add(ent.getKey());
            }
            
        }
        return res.toArray(new String[0]);
    }
}