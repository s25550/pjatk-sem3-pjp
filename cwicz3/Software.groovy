package cwicz3

def pmap = [
	Groovy: ['Asia', 'Jan'],
	Grails: ['Asia', 'Jan', 'Stefan', 'Mirek'],
	Java: ['Asia', 'Stefan', 'Mirek'],
	JEE: ['Slawek', 'Stefan', 'Janusz']
]

println "Ile osob pracuje w kazdym z projektow:"

pmap.keySet().each { key ->
	println "$key: ${pmap.get(key).size()}" 
}

println ""
println "Projekty, ktore maja wiecej niz dwoch programistow:"

pmap.findAll {
	it.value.size() > 2
}.keySet().each {
	key -> println key
}

println ""
println "W jakich projektach biora udzial poszczegolni programisci:"

List names = []

pmap.values().each({
	names = (names + it).unique()
})

names.each { name -> 
	println "$name: ${pmap.findAll({ it.value.contains(name) }).collect { el -> el.key }}"
}