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
    private int diff=0;
    public int findTilt(TreeNode root) {
        inorder(root);
        return diff;
    }
    private int inorder(TreeNode root){
        if(root==null) return 0;
        
        int left=inorder(root.left);
        int right=inorder(root.right);
        diff+=Math.abs(left-right);
        
        return left+right+root.val;
    }
}