func merge(nums1 []int, m int, nums2 []int, n int) {
	if n == 0 {
		return
	}

	tempArr := make([]int, m+n)
	var n1Idx, n2Idx int = 0, 0

	for i, _ := range tempArr {
		if n2Idx >= n || (n1Idx < m && nums1[n1Idx] <= nums2[n2Idx]) {
			tempArr[i] = nums1[n1Idx]
			n1Idx++
		} else {
			tempArr[i] = nums2[n2Idx]
			n2Idx++
		}
	}

	for i := 0; i < (m + n); i++ {
		nums1[i] = tempArr[i]
	}

	return
}