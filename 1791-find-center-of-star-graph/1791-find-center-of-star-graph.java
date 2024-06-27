class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0],b=edges[0][1];
        return b==edges[1][0]||b==edges[1][1]?b:a;
    }
}