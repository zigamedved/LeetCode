func plusOne(digits []int) []int {
	var result []int

	var digitsString string
	for i := 0; i < len(digits); i++ {
		digitsString += fmt.Sprint(digits[i])
	}

	overflow := true
	var addOneIndex int
	for i := len(digitsString) - 1; i >= 0; i-- {
		if string(digitsString[i]) == "9" {
			continue
		}
		addOneIndex = i
		overflow = false
		break
	}

	if overflow {
		result = append(result, 1)
		for i := 0; i < len(digits); i++ {
			result = append(result, 0)
		}
		return result
	}

	for i := 0; i < len(digits); i++ {
		if i > addOneIndex {
			result = append(result, 0)
			continue
		}
		if i == addOneIndex {
			result = append(result, digits[i]+1)
			continue
		}
		result = append(result, digits[i])
	}

	return result
}