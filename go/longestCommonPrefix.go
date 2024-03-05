func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}

	result := ""
	for i := 0; i < 200; i++ {
		if checkLetterAtIndex(strs, i) {
			result = fmt.Sprintf("%s%c", result, strs[0][i])
		} else {
			break
		}
	}

	return result
}

func checkLetterAtIndex(strs []string, ix int) bool {
	for i := 0; i < len(strs); i++ {
		if ix >= len(strs[i]) {
			return false
		}
		letter := strs[0][ix]
		if letter != strs[i][ix] {
			return false
		}
	}

	return true
}