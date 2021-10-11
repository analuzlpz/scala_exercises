package recfun

import recfun.RecFun.countChange

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if c == 0 || c == r then
      1
    else
      pascal(c-1, r-1) + pascal(c, r-1)

  /**
   * Exercise 2
   */
  def balance_aux(chars: List[Char], count: Int) : Int =
    if chars.isEmpty then
      count
    else
      val head = chars.head
      if head == '(' then
        val new_count = count + 1
        balance_aux(chars.tail, new_count)
      else if head == ')' then
        if count > 0 then
          val new_count = count - 1
          balance_aux(chars.tail, new_count)
        else
          balance_aux(List(), -1)
      else
        balance_aux(chars.tail, count)

  def balance(chars: List[Char]): Boolean =
    if chars.isEmpty then
      true
    else
      if balance_aux(chars, 0) == 0 then true else false


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    if money < 0 || coins.isEmpty then
      0
    else if money == 0 then
      1
    else
      countChange(money - coins.head, coins) + countChange(money, coins.tail)