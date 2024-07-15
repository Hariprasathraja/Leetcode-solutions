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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map=new HashMap<>();
        Set<Integer> childset=new HashSet<>();
        for(int[] i: descriptions){
            int parent =i[0], child=i[1], leftright=i[2];
            childset.add(child);
            TreeNode node= map.getOrDefault(parent,new TreeNode(parent));
            if(leftright==1){
                node.left=map.getOrDefault(child,new TreeNode(child));
                map.put(child,node.left);
            }else{
                node.right=map.getOrDefault(child,new TreeNode(child));
                map.put(child,node.right);
            }
            map.put(parent,node);
        }
        int root=-1;
        for(int[] i:descriptions){
            if(!childset.contains(i[0])){
                root=i[0];
                break;
            }
        }
        return map.getOrDefault(root,null);
    }
}
 