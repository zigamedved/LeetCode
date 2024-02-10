func majorityElement(nums []int) int {
	if len(nums) == 1 {
		return nums[0]
	}
	occurencies := make(map[int]int)
	condition := len(nums) / 2

	for i := 0; i < len(nums); i++ {
		val, ok := occurencies[nums[i]]
		if !ok {
			occurencies[nums[i]] = 1
		} else if val == condition {
			return nums[i]
		} else {
			occurencies[nums[i]] = val + 1
		}
	}

	return 42
}