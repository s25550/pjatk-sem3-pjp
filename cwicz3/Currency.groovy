package cwicz3

import java.text.DecimalFormat

def realNumberRegex = /\-{0,1}\d+(\.\d+){0,1}/
def inputText = "test test tekst przyklad 0.12 test 123,123456 test test -123.123"

def matches = (inputText =~ realNumberRegex)

matches.each {
	println it[0]
}

println ""

def currencyRegex = /(\-{0,1}\d+([,\.]\d{2}){0,1})([\s]*PLN)/

def pricesString = "chleb 3.00 PLN, mleko 4.50PLN, makaron 5,99 PLN, ser 21.99PLN, szynka 12 PLN"

BigDecimal rate = 1/5
DecimalFormat decimalFormat = new DecimalFormat("###,##0.00");

println pricesString.replaceAll(currencyRegex, {
	def price = it[1].replace(",", ".") as BigDecimal
	return decimalFormat.format(price * rate).toString() + "EUR"
})
