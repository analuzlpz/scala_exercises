def abs(x:Double) = if (x < 0) -x else x

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double) = ???

def improve(guess: Double, x: Double) =(guess + x / guess) / 2

def sqrt(x: Double) = sqrtIter(1.0, x)



/*
Test your version with some very small and large numbers, e.g.

0.001
0.1e-20
1.0e20
1.0e50*/