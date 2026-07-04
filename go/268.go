func missingNumber(nums []int) int {
    // Approach 1
    slices.Sort(nums)
    for ix, val := range nums{
      if ix != val{
        return ix
      }
    }

    return len(nums)


    // Approach 2
    // numMap := make(map[int]struct{})
    // for i := 0; i<=len(nums); i++{
    //     numMap[i]=struct{}{}
    // }

    // for _, el := range nums{
    //     delete(numMap, el)
    // }

    // for k, _ := range numMap {
    //    return k
    // }

    // return 42
}

/* Some options:
- sort array (costs O(nlogn) best), traverse array and return missing one (value!=index) max O(n) time

RESULT: 2ms runtime, 8.35 MB memory; 3ms 8.05MB

- build map of numbers that should be there based on input length O(n) time, traverse array and remove items from map O(n), the one remaining is the answer. 2x O(n) + map size

RESULT: 6ms runtime, 8.41 MB memory

...
*/
