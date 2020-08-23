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
    int sum=0;
        
    public int deepestLeavesSum(TreeNode root) {
		int target=deep(root,0);
        System.out.println(max);
        count(root,1);
        return sum;
    }
    
    private int deep(TreeNode root,int height){
        if(height>max){
              max=height;
        }
        if(root==null)return max;
        
        int sum1=deep(root.left,height+1);
        int sum2=deep(root.right,height+1);
        
        if(sum1>=sum2)return sum1;
        return sum2;
            
    }
    
    private void count(TreeNode root,int current){
        if(root==null)return;
        if(current == max){
            sum+=root.val;
            return;
        }
        count(root.right,current+1);
        count(root.left,current+1);
    }
}