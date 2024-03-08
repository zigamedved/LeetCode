func maxFrequencyElements(nums []int) int {
	frequencyMap := make(map[int]int)
	maxFrequency := 0
	result := 0

	for _, num := range nums {
		val, ok := frequencyMap[num]
		if ok {
			frequencyMap[num] = val + 1
		} else {
			frequencyMap[num] = 1
		}
		if frequencyMap[num] > maxFrequency {
			maxFrequency = frequencyMap[num]
		}
	}

	for _, value := range frequencyMap {
		if value == maxFrequency {
			result += value
		}
	}

	return result
}