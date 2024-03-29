func productExceptSelf(nums []int) []int {
	product := 0
	var containsZeros uint8

	for _, val := range nums {
		if val == 0 {
			containsZeros += 1
			continue
		}
		if product == 0 {
			product = 1
		}
		product *= val
	}

	var result []int
	for _, val := range nums {
		if containsZeros > 1 {
			result = append(result, 0)
			continue
		}
		if val == 0 {
			result = append(result, product)
			continue
		}
		if containsZeros == 1 {
			result = append(result, 0)
		} else {
			result = append(result, product/val)
		}
	}

	return result
}