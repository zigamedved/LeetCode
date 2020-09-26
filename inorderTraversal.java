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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> sklad = new Stack<>();
        List<Integer> res= new ArrayList<>();
        TreeNode curr = root;
        
        while(curr!=null || !sklad.isEmpty()){
            while(curr!=null){
                sklad.add(curr);
                curr=curr.left;
            }
            curr=sklad.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        
        return res;
    }
}
