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
    public List<Integer> postorder(Node root) {
        LinkedList<Node>sklad = new LinkedList<>();
        LinkedList<Integer>res = new LinkedList<>();
        
        if(root==null)return res;
        
        sklad.add(root);

        while(!sklad.isEmpty()){
            Node node = sklad.pollLast();
            res.addFirst(node.val);
            
            for(Node child:node.children){
                sklad.add(child);
            }
        }
        return res;
    }
}