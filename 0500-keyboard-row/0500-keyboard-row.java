class Solution {
    public String[] findWords(String[] words) {
    List<String>list=new ArrayList<>();
    for(String i:words){
        String st=i.toLowerCase();
        if(!st.matches(".*[^qwertyuiop].*")){
            list.add(i);
        }else if(!st.matches(".*[^asdfghjkl].*")){
            list.add(i);
        }else if(!st.matches(".*[^zxcvbnm].*")){
            list.add(i);
        }
    }
    return list.toArray(new String[list.size()]);
    }
}