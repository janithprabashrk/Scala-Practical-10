file:///C:/Users/USER/Downloads/SCS%202204%20Functional%20Pragramming%20Practicals/Scala-Practical-10/Q1.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition x is defined in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Practical-10/Untitled-1.scala
and also in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Practical-10/Q1.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\oss.sonatype.org\content\repositories\public\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 354
uri: file:///C:/Users/USER/Downloads/SCS%202204%20Functional%20Pragramming%20Practicals/Scala-Practical-10/Q1.scala
text:
```scala
class Rational(n: Int, d:Int) {
    require(d != 0, "Denominator must be non-zero")

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private val g = gcd(n.abs, d.abs)

    val numer = n / g
    val denom = d / g

    def neg: Rational = new Rational(-numer, denom)
    override def toString : String = numer + "/@@" + denom
}


```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition x is defined in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Practical-10/Untitled-1.scala
and also in
  C:/Users/USER/Downloads/SCS 2204 Functional Pragramming Practicals/Scala-Practical-10/Q1.scala
One of these files should be removed from the classpath.