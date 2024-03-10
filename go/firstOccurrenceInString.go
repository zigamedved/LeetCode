func strStr(haystack string, needle string) int {
	haystackLength := len(haystack)
	needleLength := len(needle)

	for pos, c := range haystack {
		if string(c) != string(needle[0]) {
			continue
		}

		haystackPart := getSubstring(haystack, pos, haystackLength, needleLength)
		if haystackPart == "" {
			continue
		}
		if areStringsEqual(haystackPart, needle) {
			return pos
		}
	}

	return -1
}

func getSubstring(haystack string, start, haystackLength, needleLength int) string {
	if start+needleLength > haystackLength {
		return ""
	}

	return haystack[start : start+needleLength]
}

func areStringsEqual(haystackPart, needle string) bool {
	return haystackPart == needle
}
