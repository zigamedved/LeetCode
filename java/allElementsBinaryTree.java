/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traverse(root1);
        traverse(root2);
        int[] tab = new int[result.size()];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = result.get(i);
        }
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        List<Integer> h = new ArrayList<Integer>();
        for (int i = 0; i < tab.length; i++) {
            h.add(tab[i]);
        }

        return h;
    }

    public void traverse(TreeNode root) {
        if (root == null)
            return;
        result.add(root.val);
        traverse(root.right);
        traverse(root.left);

    }

}