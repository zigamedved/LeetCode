/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return find(cloned, target.val);
    }
    public TreeNode find(TreeNode cloned, int target){
        if(cloned==null)return null;
        
        if(cloned.val==target)return cloned;
        
        TreeNode right = find(cloned.right,target);
        TreeNode left = find(cloned.left,target);
        
        if(right==null){
            return left;
        }
        return right;
    }
}