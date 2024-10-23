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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root==null) return null;
        int curLevelSum=root.val;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        root.val*=-1;
        
        while(!queue.isEmpty()){
            int levelSum=0;
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                int childSum=0;
                if(node.left!=null) childSum+=node.left.val;
                if(node.right!=null) childSum+=node.right.val;
                levelSum+=childSum;
                
                if(node.left!=null) node.left.val=-childSum;
                if(node.right!=null) node.right.val=-childSum;
                node.val+=curLevelSum;
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            curLevelSum=levelSum;
        }
    return root;
    }
}