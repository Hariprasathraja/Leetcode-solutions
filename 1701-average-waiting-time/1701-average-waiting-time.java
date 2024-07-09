class Solution {
    public double averageWaitingTime(int[][] customers) {
        double time=0,totalWaitTime=0;    
        for(int[] i:customers){
            time=Math.max(time,i[0]);
            time+=i[1];
            totalWaitTime+=(time-i[0]);
        }
        return totalWaitTime/customers.length;
    }
}