object LCD {
  
  val templates = List(
	List(" - ", "| |", "   ", "| |", " - "),
	List("   ", "  |", "   ", "  |", "   "),
	List(" - ", "  |", " - ", "|  ", " - "),
	List(" - ", "  |", " - ", "  |", " - "),
	List("   ", "| |", " - ", "  |", "   "),
	List(" - ", "|  ", " - ", "  |", " - "),
	List("   ", "|  ", " - ", "| |", " - "),
	List(" - ", "  |", "   ", "  |", "   "),
	List(" - ", "| |", " - ", "| |", " - "),
	List(" - ", "| |", " - ", "  |", "   ")
  )

  def convert(num: Int) = {
	if(num < 0) throw new IllegalArgumentException()
	
	// hack to convert int into array of digits
	val digits = num.toString.toCharArray.map(_.toString.toInt)
	
	// butt ugly imperative code
	var s = ""
	var i = 0
	while (i < 5) {
		// per line
		if(i > 0) s += "\n"
		
		var j = 0
		while(j < digits.size) {
			if(j > 0) s += " "
			
			s += templates(digits(j))(i)
			j += 1
		}
		
		i += 1
	}
	s	
  }
}