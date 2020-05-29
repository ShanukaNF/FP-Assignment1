  
object SumOfEvenNums extends App{
  
    def isEven(n:Int): Boolean = n match {
        case x if(x%2 == 0) => true
        case _ => false
    }
    def SumOfEvenNums(a:Int): Int = a match {
        case 0 => 0
        case x if(isEven(x)) => x + SumOfEvenNums(x-1)
        case x if(!isEven(x)) => SumOfEvenNums(x-1)
    }
    print("Enter a number -> ")
	val input = scala.io.StdIn.readInt()
	print(SumOfEvenNums(input))
}