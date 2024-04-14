/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sumOfLeftLeaves(root *TreeNode) int {
	return traverse(root, false)
}

func traverse(root *TreeNode, isLeft bool) int {
	if root == nil {
		return 0
	}

	if root.Right == nil && root.Left == nil && isLeft {
		return root.Val
	}

	left := traverse(root.Left, true)
	right := traverse(root.Right, false)

	return left + right
}
