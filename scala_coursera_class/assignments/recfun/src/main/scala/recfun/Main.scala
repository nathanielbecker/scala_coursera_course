package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
def pascal(c: Int, r: Int): Int =
    if (c == 0 || c==r )    1
    else (pascal(c - 1,r-1) +pascal(c ,r-1))  

  /**
   * Exercise 2
   */
def balance(chars: List[Char]): Boolean = {
    def scorecard (somehead: Char): Integer = somehead match {
        case '(' => 1
        case ')' => -1
        case _ => 0
    }
    
def balancio (chars: List[Char], scoring: Int) :  Boolean = {
    if (scoring < 0) false
    else if (chars.isEmpty && scoring ==0) true
    else if (chars.isEmpty) false
    else balancio(chars.tail, scoring + scorecard(chars.head))
    
}
balancio(chars,0)

}                           
  /**
   * Exercise 3
   */


def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0 || coins.isEmpty) 0
//    else for (i <- 1 to (math floor (money/(coins.head) ))) {
//                countChange(money - i*coins.head, coins.tail)
//                }
    else {
     countChange(money, coins.tail) + countChange(money - coins.head, coins)
    
    }
} 

}
