/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    LinkedList<Integer>res = new LinkedList<>();
    
    public List<Integer> postorder(Node root) {
        if(root==null)return res;
        find(root);
        return res;
    }
    private void find(Node root){
        if(root==null)return;
        
        for(Node child:root.children){
            find(child);
        }
        res.add(root.val);
        
    }
    
}