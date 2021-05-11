/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 //Will change to non recursive eventually.
public class Solution {
    IList<int> returnMe = new List<int>();
    
    public IList<int> PreorderTraversal(TreeNode root) {
        //if(root == null) return null;
        
        TreeNode temp = root;
        recursePreOrder(temp);
        
        return returnMe;
        
        //First init list of tree nodes, the stack stores the previously visited nodes (implicit in recursive)
//         var returnMe = new List<TreeNode>();
//         var prevNodes = new Stack<TreeNode>();
//         var tempRoot = root;
        
//         bool rightVisited = false;
//         bool rootPass = false; //when we pass root and return to root in stack exit.
        
//         if(root == null) return null;
        
//         while(rootPass == false){
            
//             prevNodes.push(tempRoot);
//             if(tempRoot.left != null){
//                 tempRoot = tempRoot.left;
//             }
            
//         }
    }
    
    public void recursePreOrder(TreeNode root){
        if(root == null){
            return;
        }
        Console.Write(root.val + " root\n");
        returnMe.Add(root.val);
        if(root.left != null){
            Console.Write(root.left.val + " left\n");
            recursePreOrder(root.left);
        }
        if(root.right != null){
            Console.Write(root.right.val + " right\n");
            recursePreOrder(root.right);
        }
    }
}