func canJump(nums []int) bool {
	max := 0

	for i := 0; i < len(nums); i++ {
		if i > max {
			return false
		}

		if nums[i]+i >= max {
			max = nums[i] + i
		}

		if max > len(nums) {
			return true
		}
	}
	return true
}