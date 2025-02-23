func hIndex(citations []int) int {
	sort.Sort(sort.Reverse(sort.IntSlice(citations)))

	answer := 0

	for i := 1; i <= len(citations); i++ {
		res := calculateIndex(i, &citations)
		if res > 0 {
			answer = i
		}
	}

	return answer
}

func calculateIndex(index int, citations *[]int) int {
	var count = 0

	for _, el := range *citations {
		if el >= index {
			count++
			continue
		} else {
			break
		}
	}

	if count >= index {
		return count
	}

	return 0
}
