package cwicz3

def list1 = ['a', 'b', 'c']
def list2 = [1, 8, 23]

print("list1: ")
list1.each {
	print(it)
	print(" ")
}

println()

print("list2: ")
list2.each {
	print(it)
	print(" ")
}

println()

List list11 = []
list1.each {
	list11.add(it + it)
}
println(list11)

List list12 = []
list2.each {
	list12.add(it + it)
}
println(list12)
