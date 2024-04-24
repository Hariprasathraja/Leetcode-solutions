class Solution {
    private int[] map={2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
    public String[] findWords(String[] words) {
    List<String>list=new ArrayList<>();
    for(String i:words){
        if(check(i.toLowerCase())){
            list.add(i);
        }
    }
    return list.toArray(new String[list.size()]);
    }
    private boolean check(String st){
        int r=map[st.charAt(0)-'a'];
        for(char c:st.toCharArray()){
            if(map[c-'a']!=r){
                return false;
            }
        }
        return true;
    }
}
