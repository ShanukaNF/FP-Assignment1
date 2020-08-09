object Q1 extends App
{
    val p1 = Point(3,4)
    val p2 = Point(5,7)
    val p3 = p1.distance(6,7)
    val p4 = p2.distance(1,2) 
    println(p1)
    println(p2)
    println(p3)
    println(p4)  
}
case class Point(a:Int,b:Int)
{
    def x:Int = a;
    def y:Int = b;
 	def distance(dx:Int,dy:Int): Double = scala.math.sqrt(scala.math.pow(this.x - dx, 2) + scala.math.pow(this.y - dy, 2))
}