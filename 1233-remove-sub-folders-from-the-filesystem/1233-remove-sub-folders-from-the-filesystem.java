class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res=new ArrayList<>();
        Arrays.sort(folder);
        
        for(String i: folder){
            if(res.isEmpty()|| !i.startsWith(res.get(res.size()-1)+"/")){
                res.add(i);
            }
        }
        return res;
    }
}