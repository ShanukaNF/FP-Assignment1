object Q1 extends App
{
    val p1 = Point(3,4)
    val p2 = Point(5,7)
    val p3 = p1.move(6,7)
    val p4 = p2.move(1,2) 
    println(p1)
    println(p2)
    println(p3)
    println(p4)  
}
case class Point(a:Int,b:Int)
{
    def x:Int = a;
    def y:Int = b;
 	def move(dx:Int,dy:Int) = Point(this.x + dx,this.y+dy)
}