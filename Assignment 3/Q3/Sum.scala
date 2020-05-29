object Sum extends App{
	def Sum(y:Int):Int = y match{
		case 0 => 0
		case _ => y + Sum(y - 1)
	}
	print("Enter a number -> ")
	val input = scala.io.StdIn.readInt()
	print(Sum(input))
}