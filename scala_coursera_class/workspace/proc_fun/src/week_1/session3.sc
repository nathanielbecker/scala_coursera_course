package week_1

object session3 {

def calulateChangeCombinations(money: Int, coins: List[Int]): Int = {
  if(money == 0) 1
  else if (money < 0 || coins.isEmpty) 0
  else {
    calulateChangeCombinations(money - coins.head, coins) +
    calulateChangeCombinations(money, coins.tail)
  }
}                                                 //> calulateChangeCombinations: (money: Int, coins: List[Int])Int

def getListOfChangeCombinations (moneySum: Int, coins: List[Int]): Int = {
  //just handle zero money case
  if (moneySum == 0) 0
  else calulateChangeCombinations(moneySum, coins)
}                                                 //> getListOfChangeCombinations: (moneySum: Int, coins: List[Int])Int

getListOfChangeCombinations(6,List(1,3,2))        //> res0: Int = 7


}