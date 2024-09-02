class Rational(n: Int, d:Int) {
    require(d != 0, "Denominator must be non-zero")

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private val g = gcd(n.abs, d.abs)

    val numer = n / g
    val denom = d / g

    def neg: Rational = new Rational(-numer, denom)
    override def toString : String = numer + "/" + denom
}

object Main {
    def main(args: Array[String]): Unit = {
        val x = new Rational(1, 3)
        val negX = x.neg
        println(negX)
    }
}

