object solution extends App
{
    // x=3/4, y=5/8, z=2/7
    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);
    var solution = x - y - z;
    println(solution);
}

class Rational(n:Int,d:Int){
    def numerator:Int = n/(gcd(n,d));
    def denominator:Int = d/gcd(n,d);
    def this(n:Int) = this(n,1);
    def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b);
    def neg = new Rational(-this.numerator,this.denominator);
    def -(r:Rational)= new Rational(this.numerator*r.denominator - this.denominator*r.numerator,this.denominator*r.denominator);
    override def toString = numerator + "/" + denominator;
}