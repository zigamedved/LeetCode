func findDisappearedNumbers(nums []int) []int {
    // constructing lookup map
    artificialSet := make(map[int]struct{})
    for _, el := range nums{
        artificialSet[el] = struct{}{}
    }

    res := make([]int, 0)
    // traversing required numbers, appending if number not in input
    for i := 1; i<=len(nums); i++{
       _, ok := artificialSet[i]
       if !ok{
        res = append(res, i)
       }
    }

    return res
}
