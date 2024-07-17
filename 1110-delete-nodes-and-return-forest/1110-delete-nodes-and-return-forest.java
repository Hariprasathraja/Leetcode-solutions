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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if(root==null) return new ArrayList<>();
        Set<TreeNode> forest=new HashSet<>();
        forest.add(root);
        if(to_delete.length==0) return new ArrayList<>(forest);
        Set<Integer> del=new HashSet<>();
        for(int i:to_delete){
            del.add(i);
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(del.contains(node.val)){
                forest.remove(node);
                if(node.left!=null) forest.add(node.left);
                if(node.right!=null) forest.add(node.right);
            }
            if(node.left!=null){
                queue.offer(node.left);
                if(del.contains(node.left.val)) node.left=null;
            }
            if(node.right!=null){
                queue.offer(node.right);
                if(del.contains(node.right.val)) node.right=null;
        }
    }
    return new ArrayList<>(forest);
    }
}