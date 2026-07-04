func missingNumber(nums []int) int {
    sum := 0
    for _, el := range nums{
        sum+=el
    }

    n := len(nums)
    return (n*(n+1))/2 - sum
}

/* Some options:
- sort array (costs O(nlogn) best), traverse array and return missing one (value!=index) max O(n) time

RESULT: 2ms runtime, 8.35 MB memory; 3ms 8.05MB

- build map of numbers that should be there based on input length O(n) time, traverse array and remove items from map O(n), the one remaining is the answer. 2x O(n) + map size

RESULT: 6ms runtime, 8.41 MB memory

- O(N) sum up items, subtract that from the required sum (n*(n+1))/2

RESULT: 0ms runtime, 8.52 MB memory
...
*/
