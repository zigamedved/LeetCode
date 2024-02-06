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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null)return 0;
        
        if(root.val<L || root.val>R){
            root.val=0;
        }
        
        return (root.val+rangeSumBST(root.right,L,R)+rangeSumBST(root.left,L,R));
        
    }
    

    
    
}