func lengthOfLastWord(s string) int {
	hasSeenLetter := false
	wordLength := 0

	for i := len(s) - 1; i >= 0; i-- {
		//currentLetter := string(s[i])

		if string(s[i]) != " " && !hasSeenLetter {
			hasSeenLetter = true
			wordLength++
			continue
		}

		if string(s[i]) == " " && !hasSeenLetter {
			continue
		}

		if string(s[i]) != " " && hasSeenLetter {
			wordLength++
			continue
		}

		if hasSeenLetter && string(s[i]) == " " {
			return wordLength
		}
	}

	return wordLength
}