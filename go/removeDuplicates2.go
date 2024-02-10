func removeDuplicates(nums []int) int {
	iidx := 1
	occurences := make(map[int]int) // it's possible to do without map
	occurences[nums[0]] = 1

	for i := 1; i < len(nums); i++ {
		count, ok := occurences[nums[i]]
		if !ok {
			occurences[nums[i]] = 1
		} else {
			occurences[nums[i]] = count + 1
		}

		if nums[i] != nums[i-1] {
			nums[iidx] = nums[i]
			iidx++
			continue
		}
		if count+1 <= 2 {
			nums[iidx] = nums[i]
			iidx++
		}
	}
	return iidx
}