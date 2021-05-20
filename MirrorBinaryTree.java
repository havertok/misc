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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null) return root;

        Stack<TreeNode> visitedNodes = new Stack<TreeNode>();
        visitedNodes.push(root);
        
        while(!visitedNodes.isEmpty()){
            TreeNode current = visitedNodes.pop();
            if(current != null){
                TreeNode left = current.left;
                current.left = current.right;
                current.right = left;
                if(current.left != null) visitedNodes.push(current.left);
                if(current.right != null) visitedNodes.push(current.right);
            }
            
        }
        
        return root;
    }
}