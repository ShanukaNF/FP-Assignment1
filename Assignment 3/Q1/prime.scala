object prime extends App{
	def gcd(a:Int, b:Int):Int = b match {
		case 0 => a
		case x if x > a => gcd(x,a)
		case _ => gcd(b,a%b)	
	}
	def prime(p:Int,n:Int = 2):Boolean = n match{
		case x if(x < 2) => false
		case x if(x == p) => true
		case x if gcd(p,x) > 1 => false	
		case x => prime(p,x+1)	
	}
	print("Enter a number -> ")
	val input = scala.io.StdIn.readInt()
	print(prime(input))
}