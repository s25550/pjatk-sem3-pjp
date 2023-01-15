package cwicz1

def words = 'zero jeden dwa trzy cztery piec szesc siedem osiem dziewiec'.tokenize()

def scanner = new Scanner(System.in)

// def input = ask('Podaj liczbe')
print "Podaj liczby: "
def input = scanner.nextLine()

def out = []
for (character in input) {
	if (character.isNumber()) {
		out << words[character.toInteger()]
	}
}
println out.join(' - ')
