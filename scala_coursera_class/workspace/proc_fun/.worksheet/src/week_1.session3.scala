package week_1

object session3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(289); 

def calulateChangeCombinations(money: Int, coins: List[Int]): Int = {
  if(money == 0) 1
  else if (money < 0 || coins.isEmpty) 0
  else {
    calulateChangeCombinations(money - coins.head, coins) +
    calulateChangeCombinations(money, coins.tail)
  }
};System.out.println("""calulateChangeCombinations: (money: Int, coins: List[Int])Int""");$skip(184); 

def getListOfChangeCombinations (moneySum: Int, coins: List[Int]): Int = {
  //just handle zero money case
  if (moneySum == 0) 0
  else calulateChangeCombinations(moneySum, coins)
};System.out.println("""getListOfChangeCombinations: (moneySum: Int, coins: List[Int])Int""");$skip(44); val res$0 = 

getListOfChangeCombinations(6,List(1,3,2));System.out.println("""res0: Int = """ + $show(res$0))}


}
