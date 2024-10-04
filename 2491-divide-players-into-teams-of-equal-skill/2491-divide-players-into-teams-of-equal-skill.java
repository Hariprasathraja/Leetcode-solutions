class Solution {
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