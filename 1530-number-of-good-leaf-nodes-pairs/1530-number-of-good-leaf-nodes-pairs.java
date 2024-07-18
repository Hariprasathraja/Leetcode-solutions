/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int count=0;
    private int max_d=10;
    public int countPairs(TreeNode root, int distance) {
        dfs(root,distance);
        return count;
    }
    private int[] dfs(TreeNode node, int dis){
        if(node==null) return new int[max_d+1];
        
        if(node.left==null && node.right==null){
            int[] res=new int[max_d+1];
            res[1]=1;
            return res;
        }
        
        int[] left=dfs(node.left,dis);
        int[] right=dfs(node.right,dis);
        
        for(int i=1;i<=dis;i++){
            for(int j=1;j<=dis-i;j++){
                count+=left[i]*right[j];
            }
        }
        int[] res=new int[max_d+1];
        for(int i=1;i<max_d;i++){
            res[i+1]=left[i]+right[i];
        }
        return res;
    }
}
