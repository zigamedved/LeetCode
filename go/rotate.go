func rotate(nums []int, k int) {
	if len(nums) == 1 {
		return
	}

	k = k % len(nums)

	copyArray := make([]int, len(nums))
	for i, value := range nums {
		copyArray[i] = value
	}

	for i := k; i < len(nums); i++ {
		nums[i] = copyArray[i-k]
	}

	for i := len(nums) - k; i < len(nums); i++ {
		nums[i-(len(nums)-k)] = copyArray[i]
	}
}