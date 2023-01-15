package cwicz2

def maximum(elements) {
	def max = elements.max()
	def list = []

	elements.eachWithIndex{ element, index ->
		if (element == max) {
			list.push(index)
		}
	}
	return [max, list.sort()]
}

(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"
