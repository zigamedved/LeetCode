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
    int count=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        search(root,1);
        return count;
    }
    public void search(TreeNode root, int depth){
        if(root==null)return;
        if(root.right==null && root.left==null){
            if(depth<count)count=depth;
            return;
        }
        search(root.left,depth+1);
        search(root.right,depth+1);
        return;
    }
}