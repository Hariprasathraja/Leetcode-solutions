class Solution {
    public int passThePillow(int n, int time) {
        int cyclelen=(n-1)*2;
        int pos=time%cyclelen;
        
        if(pos<n) return pos+1;
        else return cyclelen-pos+1;
    }
}