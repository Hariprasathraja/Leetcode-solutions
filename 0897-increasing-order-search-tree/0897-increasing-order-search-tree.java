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
    TreeNode prev;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        TreeNode skew=new TreeNode(0);
        prev=skew;
        inorder(root);
        return skew.right;
        
    }
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        prev.right=root;
        root.left=null;
        prev=root;
        inorder(root.right);
    }
}