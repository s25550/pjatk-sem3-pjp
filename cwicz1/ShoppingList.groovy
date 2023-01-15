package cwicz1

def collectProducts() {
	def map = [:].withDefault { 0 }

	while (true) {
		def rawProduct = getProduct()
		if (rawProduct == "") {
			break
		}

		def parts = rawProduct.split("=")
		def product = parts[0].trim()
		def price = new BigDecimal(parts[1].trim().replace(",", "."))

		if (map.containsKey(product)) {
			def sum = map.get(product)
			sum += price
			map.replace(product, sum)
		} else {
			map.put(product, price)
		}
	}
	return map
}

def getProduct() {
	def prompt = true
	def scanner = new Scanner(System.in)
	def input = ""

	while (prompt) {
		prompt = false
		print ""
		print "Podaj produkt: "
		input = scanner.nextLine()
		if (input == null || input.equals("")) {
			break
		}

		if (!input.matches(/^[a-zA-Z]+[\s]*=[\s]*[0-9]+([,\.][0-9]{1,2})*$/)) {
			prompt = true
			println "Niepoprawna wartosc: $input (wpisz w formacie: produkt = koszt)"
		}
	}
	return input
}

def list = collectProducts()
println "Lista zakupow:"

list.each { key, value -> println "$key: $value PLN" }
