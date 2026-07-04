func containsDuplicate(nums []int) bool {

    // keep track of occurencies of each element: occurenciesByElements
    // int and bool to keep memory allocation small
    occByEl := make(map[int]bool)

    // simple loop with short circuiting
	for _, el := range nums{
        _, ok := occByEl[el]
        if ok{
            return true
        }else{
            occByEl[el] = true
        }
  }

    return false
}
