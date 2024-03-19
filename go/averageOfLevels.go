/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func averageOfLevels(root *TreeNode) []float64 {
	values := make(map[int][]int)

	iterateLevel(root, values, 0)
	result := make([]float64, len(values))

	for k, v := range values {
		var tmpResult float64
		for _, el := range v {
			tmpResult += float64(el)
		}

		result[k] = tmpResult / float64(len(v))
	}

	return result
}

func iterateLevel(root *TreeNode, values map[int][]int, level int) {
	if root == nil {
		return
	}

	val, ok := values[level]
	if !ok {
		values[level] = []int{}
		values[level] = append(values[level], root.Val)
	} else {
		values[level] = append(val, root.Val)
	}

	if root.Left != nil {
		iterateLevel(root.Left, values, level+1)
	}

	if root.Right != nil {
		iterateLevel(root.Right, values, level+1)
	}
}