/* 1. do this:
  *| *| * ...
 --+--+-- ...
  *| *| * ...
 --+--+-- ...
  *| *| * ...
 ...
*/

fun main() {
    val n = 6
    // Loop:
    for (i in 1..(n*2 - 1)) {
        var x = " * |"
        if (i % 2 == 0) x = "---+"
        val y: String = x.substring(0, x.length-1)

        for (j in 1..(n-1)) {
            print(x)
        }
        println(y)
    }
}
// compiler: https://kotlinlang.org/docs/command-line.html#create-and-run-an-application