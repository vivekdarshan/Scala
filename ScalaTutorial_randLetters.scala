object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0
		
		// until is often used to loop through strings or arrays
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i <- 0 until randLetters.length){
 
      // Get the letter in the index of the String
      println(randLetters(i))
    }
	}
}