class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
    int val=tickets[k];
    int time=0;
    for(int i=0;i<tickets.length;i++){
        int max=(i<=k)?val:val-1;
        time+=(tickets[i]>max)?max:tickets[i];
    }   
    return time;
    }
}