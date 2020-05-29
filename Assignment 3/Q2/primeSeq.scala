object primeSeq extends App{
	def gcd(a:Int, b:Int):Int = b match {
		case 0 => a
		case x if x > a => gcd(x,a)
		case _ => gcd(b,a%b)	
	}
	def prime(p:Int,n:Int = 2):Unit = n match{
		case x if(x == p) => println(p)
		case x if gcd(p,x) > 1 => -1 //gets a warning for this expression for doing nothing(not an error).
		case x => prime(p,x+1)	
	}
	def primeSeq(p:Int):Unit = p match{
		case x if(x > 1) => prime(x); primeSeq(p-1);
		case x if(x == 1) => System.exit(1);	
	}
	print("Enter a number -> ")
	val input = scala.io.StdIn.readInt()
	primeSeq(input)
}