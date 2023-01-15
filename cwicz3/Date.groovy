package cwicz3

import java.text.ParseException
import java.text.SimpleDateFormat

def inputText = """2023-01-15 aaaaaa
2023-60-15
2023-01-60
bbbbbb 2023-01-15"""

def matches = (inputText =~ /\d{4}-\d{2}-\d{2}/)
def validDates = matches.findAll({
	boolean valid = true

	try {
		def dateFormat = new SimpleDateFormat("yyyy-MM-dd")
		dateFormat.setLenient(false)
		dateFormat.parse(it)
	} catch(ParseException e) {
		valid = false
	}

	return valid
})

println validDates
