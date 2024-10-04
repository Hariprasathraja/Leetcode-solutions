/*class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length%2!=0) return -1;
        Arrays.sort(skill);
        int tot=skill[0]+skill[skill.length-1];
        int left=0, right=skill.length-1;
        long res=0;
        while(left<right){
            if(skill[left]+skill[right]!=tot) return -1;
            res=res+(skill[left]*skill[right]);
            left++;
            right--;
        }
        return res;
    }
}
*/
class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        if(n%2!=0) return -1;
        
        long totalSum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: skill){
            map.put(i,map.getOrDefault(i,0)+1);
            totalSum+=i;
        }
        long targetSum=totalSum/(n/2);
        long res=0;
        for(int i: skill){
            if(map.get(i)==0) continue;
            
            int complement=(int)targetSum-i;
            if(map.getOrDefault(complement, 0) == 0) return -1;
            
            res=res+(i*complement);
            map.put(i,map.get(i)-1);
            map.put(complement,map.get(complement)-1);
        }
        return res;
    }
}