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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int minDepth=1;
        
        while(!queue.isEmpty()){
            int n=queue.size();
            
            for(int i=0;i<n;i++){
                TreeNode node=queue.poll();
                
                if(node.left==null && node.right==null) return minDepth;
                
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            minDepth++;
        }
        return minDepth;
    }
}