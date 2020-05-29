object Fibonacci extends App{
    def fibSeq(n:Int):Unit ={
        var i = 0;
        while(i <= n)
        {
          println(Fibonacci(i))
          i += 1;
        }
      
    }
    def Fibonacci(x:Int): Int = x match {
        case x if(x==0) => 0
        case x if(x==1) => 1
        case x => Fibonacci(x-1) + Fibonacci(x-2)
    }
  print("Enter a number -> ")
  val input = scala.io.StdIn.readInt()
  fibSeq(input)
} 