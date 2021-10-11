import scala.annotation.tailrec

def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n-1)

@tailrec
def factorial2(n: Int, fact: Int = 1): Int =
  if (n == 0) 1 else factorial2(n-1, n * fact)


factorial2(4)