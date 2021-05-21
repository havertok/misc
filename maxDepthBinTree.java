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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        Stack<TreeNode> visited = new Stack<TreeNode>();
        Stack<Integer> depth = new Stack<Integer>();
        int max = 1;
        int currDepth = 1;
        visited.push(root);
        depth.push(currDepth);
        
        while(!visited.isEmpty()){
            TreeNode current = visited.pop();
            currDepth = depth.pop();
            if(currDepth > max){
                max = currDepth;
            }
            if(current != null){
                currDepth++;
                if(current.left != null){
                    visited.push(current.left);
                    depth.push(currDepth);
                }
                if(current.right != null){
                    visited.push(current.right);
                    depth.push(currDepth);
                }
            } else {
                currDepth--;
            }
        }
        
        return max;
    }
}