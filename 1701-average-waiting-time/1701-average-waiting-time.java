class Solution {
    public double averageWaitingTime(int[][] customers) {
        int time=-1;
        double totalWaitTime=0;    
        for(int[] i:customers){
            time=time<i[0]? i[0]:time;
            time+=i[1];
            totalWaitTime+=(time-i[0]);
        }
        return totalWaitTime/customers.length;
    }
}