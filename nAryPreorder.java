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
    public List<Integer> preorder(Node root) {
        LinkedList<Node> sklad = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        if(root==null)return res;
        sklad.add(root);
        while(sklad.isEmpty()==false){
            Node node = sklad.pollLast();
            res.add(node.val);
            Collections.reverse(node.children);
            for(Node child: node.children)
                sklad.add(child);
            
        }
        return res;
    }
}