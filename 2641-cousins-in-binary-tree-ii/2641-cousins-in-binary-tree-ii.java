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
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        root.val=0;
        
        while(!queue.isEmpty()){
            int levelSum=0;
            int size=queue.size();
            List<TreeNode> list=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                list.add(node);
                
                if(node.left!=null){
                    levelSum+=node.left.val;
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    levelSum+=node.right.val;
                    queue.offer(node.right);
                }
            }
            
            for(TreeNode node: list){
                int cousinSum=levelSum;
                
                if(node.left!=null) cousinSum-=node.left.val;
                if(node.right!=null) cousinSum-=node.right.val;
                
                if(node.left!=null) node.left.val=cousinSum;
                if(node.right!=null) node.right.val=cousinSum;
            }
        }
    return root;
    }
}