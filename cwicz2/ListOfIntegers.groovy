package cwicz2

import javax.swing.JOptionPane

List getInts() {
	def numbers = []
	def err = false
	while (true) {
		def message = "Podaj liczbę"
		if (err) {
			err = false
			message = "Błąd. $message"
		}
		def input = JOptionPane.showInputDialog(null, message, "")
		if (input == null || input.equals("")) {
			break
		}
		if (input.isInteger()) {
			Integer integer = Integer.parseInt(input)
			numbers.add(integer)
		} else {
			err = true
		}
	}

	return numbers
}

print getInts()
