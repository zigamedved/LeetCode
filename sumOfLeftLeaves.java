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
    int sum = 0; 
    
    public int sumOfLeftLeaves(TreeNode root) {
        int a = count(root,0,0);
        return sum;
    }
    
    public int count(TreeNode root, int left, int right){
        if(root==null)return -1;
        int l = count(root.left,1,0);
        int r = count(root.right,0,1);
        if(l==-1 && r==-1 && left==1){
            sum+=root.val;
        }
        return 0; 
    }
    
}