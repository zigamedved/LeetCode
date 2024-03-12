
func isPalindrome(s string) bool {
	s = clean(strings.ToLower(s))
	if len(s) < 2 {
		return true
	}

	i, j := 0, len(s)-1
	for i < j {
		if s[i] != s[j] {
			return false
		}
		i += 1
		j -= 1
	}

	return true
}

func clean(s string) string {
	return regexp.MustCompile(`[^a-zA-Z0-9]+`).ReplaceAllString(s, "")
}