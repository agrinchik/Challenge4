package academy.learnprogramming.challenge4

fun main() {

  // 5, 10, 15, 20 ... 5000
  for(n in 5..5000 step 5) {
    println(n)
  }

  // -500, -499, -498 ... 0
  for(n in -500..0) {
    println(n)
  }

  // 0, 1, 1, 2, 3, 5, 8 ...
  // print the first 15 numbers in the Fibonacci sequence
  var first = 0
  var second = 1
  println(first)
  for (i in 1..14) {
    println(second)
    val prevSecond = second
    second += first
    first = prevSecond
  }

  // print the following sequence using the code below: 1, 11, 100, 99, 98, 2
  for (i in 1..5) {
    println(i)
    if (i == 2) {
      break
    }
    iloop@
    for (j in 11..20) {
      println(j)
      for (k in 100 downTo 90) {
        println(k)
        if (k == 98) {
          break@iloop
        }
      }
    }
  }

  // Declare a variable called num (int) and assign it whatever you want

  // Declare a variable called dnum (double) and assign it as follows:
  // if num > 100, assign dnum = -234.567
  // if num < 100, assign dnum = 4444.555
  // if num == 100, assign dnum = 0.0
  // do all of the above in one statement/expression

  // Then print the value of dnum - separate statement
  val num = 123
  val dnum = when {
    num > 100 -> -234.567
    num < 100 -> 4444.555
    else -> 0.0
  }
  println(dnum)



}