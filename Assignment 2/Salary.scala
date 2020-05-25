object Salary extends App{
	def wage(h:Int):Int = h * 150
	def ot(h:Int):Int = h * 75
	def total(h1:Int,h2:Int):Int = wage(h1) + ot(h2)
	def tax(h1:Int,h2:Int):Double = total(h1,h2) * 0.1
	def income(h1:Int,h2:Int):Double = total(h1:Int,h2:Int) - tax(h1:Int,h2:Int)
	println(income(40,20))
}