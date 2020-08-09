object Q1 extends App{
    val p1 = Point(3,4)
    val p2 = Point(5,7)
    val p3 = p1 + p2 
    println(p1)
    println(p2)
    println(p3)
   
}
case class Point(a:Int,b:Int)
{
    def x:Int = a;
    def y:Int = b;
    def +(that:Point) = Point(this.x+that.x,this.y + that.y)
}    