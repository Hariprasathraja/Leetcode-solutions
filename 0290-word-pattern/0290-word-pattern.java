class Solution {
    public boolean wordPattern(String p, String s) {
    String[]st=s.split(" ");
    if(p.length()!=st.length){
        return false;
    }
    HashMap<Character,String>map=new HashMap<>();
    for(int i=0;i<st.length;i++){
           if(map.containsKey(p.charAt(i))){
                if(!map.get(p.charAt(i)).equals(st[i])){
                    return false;
                }
            }else{
                if(map.containsValue(st[i])){
                    return false;
                }
                map.put(p.charAt(i),st[i]);
           }
      }    
    return true;
    }
}