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
    private List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return list;
        traverse(root,0);
        return list;        
    }
    private void traverse(TreeNode root,int depth){
        if(root==null) return;
        if(depth==list.size()) list.add(root.val);
        if(root.right!=null) traverse(root.right,depth+1);
        if(root.left!=null) traverse(root.left,depth+1);
    }
}