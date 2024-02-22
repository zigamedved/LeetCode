class Solution:
    def romanToInt(self, s: str) -> int:
        romanMap = {"I": 1, "V": 5, "X": 10,
                    "L": 50, "C": 100, "D": 500, "M": 1000}
        length = len(s)-1
        answer = 0
        curr = 0

        for i in range(length):
            if romanMap[s[i]] >= romanMap[s[i+1]] and curr > 0:
                answer += curr
                curr = 0
            elif romanMap[s[i]] >= romanMap[s[i+1]]:
                answer += romanMap[s[i]]
            else:
                curr += (romanMap[s[i+1]] - romanMap[s[i]])

        if curr > 0:
            answer += curr
        else:
            answer += romanMap[s[length]]

        return answer
