var memoisationTable map[int]int

func init() {
	memoisationTable = make(map[int]int)
}

func climbStairs(n int) int {
	stepCount, exists := memoisationTable[n]
	if exists {
		return stepCount
	}

	if n == 0 {
		return 1
	} else if n < 0 {
		return 0
	}

	smallStep := climbStairs(n - 1)
	bigStep := climbStairs(n - 2)
	memoisationTable[n] = smallStep + bigStep

	return memoisationTable[n]
}