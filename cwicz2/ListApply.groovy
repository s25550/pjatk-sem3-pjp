package cwicz2

List apply(List l, Closure c) {
	l.collect(c)
}

// integer to the power of 2
println apply([1,2,3,4], {
	it * it
})

// integer times 5
println apply([5,6,7,8], {
	it * 5
})

// string uppercase
println apply(["abc","def","ghi"], {
	it.toUpperCase()
})
