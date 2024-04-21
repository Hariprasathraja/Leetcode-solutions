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
    public boolean isSymmetric(TreeNode root) {
        return Mirror(root,root);
    }
    public boolean Mirror(TreeNode n1,TreeNode n2){
        if(n1==null||n2==null){
            return n1==n2;
        }
        if(n1.val==n2.val){
            return (Mirror(n1.left,n2.right)&& Mirror(n1.right,n2.left));
        }
        return false;
    }
}