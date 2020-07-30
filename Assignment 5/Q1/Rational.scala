object solution extends App{
    val r1 = new Rational(5,7);
    val r2 = new Rational(2,11);
    var x = r1.neg;
    var y = r2.neg;
    println(x);
    println(y);
    
}

class Rational(n:Int,d:Int)
{
    def numerator:Int = n/(gcd(n,d));
    def denominator:Int = d/gcd(n,d);

    def this(n:Int) = this(n,1);
    def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b); 
    def neg = new Rational(-this.numerator,this.denominator);
    override def toString = numerator + "/" + denominator;
}