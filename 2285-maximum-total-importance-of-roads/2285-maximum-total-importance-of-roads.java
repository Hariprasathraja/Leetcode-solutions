class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long sum=0, num=1;
        long[] degree=new long[n];
        for(int i[]: roads){
            degree[i[0]]++;
            degree[i[1]]++;
        }
        Arrays.sort(degree);
        for(long i:degree){
            sum+=i*num++;
        }
        return sum;
    }
}