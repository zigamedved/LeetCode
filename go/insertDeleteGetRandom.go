type RandomizedSet struct {
	Values map[int]int
}

func Constructor() RandomizedSet {
	var newRandomizedSet RandomizedSet
	newRandomizedSet.Values = make(map[int]int)
	return newRandomizedSet
}

func (this *RandomizedSet) Insert(val int) bool {
	_, ok := this.Values[val]
	if ok {
		return false
	}

	this.Values[val] = val

	return true
}

func (this *RandomizedSet) Remove(val int) bool {
	_, ok := this.Values[val]
	if ok {
		delete(this.Values, val)
		return true
	}

	return false
}

func (this *RandomizedSet) GetRandom() int {
	randomIndex := rand.Intn(len(this.Values))

	i := 0
	for _, value := range this.Values {
		if i == randomIndex {
			return value
		}
		i++
	}

	return -1
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Insert(val);
 * param_2 := obj.Remove(val);
 * param_3 := obj.GetRandom();
 */