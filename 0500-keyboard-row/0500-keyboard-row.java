class Solution {
    public String[] findWords(String[] words) {
    List<String>list=new ArrayList<>();
    for(String i:words){
        if(!i.matches(".*[^QWERTYUIOPqwertyuiop].*")){
            list.add(i);
        }else if(!i.matches(".*[^ASDFGHJKLasdfghjkl].*")){
            list.add(i);
        }else if(!i.matches(".*[^ZXCVBNMzxcvbnm].*")){
            list.add(i);
        }
    }
    return list.toArray(new String[list.size()]);
    }
}