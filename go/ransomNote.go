func canConstruct(ransomNote string, magazine string) bool {
	letterMap := make(map[string]int)

	for _, el := range magazine {
		letter := string(el)
		val, ok := letterMap[letter]
		if ok {
			letterMap[letter] = val + 1
		} else {
			letterMap[letter] = 1
		}
	}

	for _, el := range ransomNote {
		letter := string(el)
		val, ok := letterMap[letter]
		if !ok || val == 0 {
			return false
		} else {
			letterMap[letter] = val - 1
		}
	}

	return true
}
