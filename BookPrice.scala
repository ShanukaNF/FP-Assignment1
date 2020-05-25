object BookTotal extends App{
	def bookPrice(a:Int):Double = a * 24.95;
	def discount(b:Double):Double = b * 0.4;
	def shipping(x:Int):Double = if (x <= 50) 3 else 3 + (x - 50) * 0.75;//for the first 50 books shpping price is 3 Rupees
	def BookTotal():Double =bookPrice(60) - discount(60) + shipping(60);
	println(BookTotal);

}