object ceaserCipher extends App{
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val E = (c:Char, key:Int, a:String)=> a ((a.indexOf(c.toUpper) + key) % a.size)
	val D = (c:Char, key:Int, a:String)=> a ((a.indexOf(c.toUpper) - key + a.size) % a.size)
	val cipher = (algo: (Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algo(_, key, a))
	var sample = "SCALAXZ"
	val Encrypt = cipher(E, sample, 5, alphabet)
	val Decrypt = cipher(D, Encrypt, 5, alphabet)
	println(Encrypt)
	println(Decrypt)

}