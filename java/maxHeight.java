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
    int max=0;
    
    public int maxDepth(TreeNode root) {
        find(root,0);
        return max;    
    }
    
    
    public void find(TreeNode root, int height){
        if(root==null){
            if(height>max)max=height;
            return;
        }
        find(root.right,height+1);
        find(root.left,height+1);
        
    }
    
    
}