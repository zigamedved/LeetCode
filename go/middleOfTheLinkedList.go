/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func middleNode(head *ListNode) *ListNode {
	nodes := make([]*ListNode, 100)
	numOfNodes := 0

	for head != nil {
		nodes[numOfNodes] = head
		numOfNodes++
		head = head.Next
	}

	return nodes[numOfNodes/2]
}