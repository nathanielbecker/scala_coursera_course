package week_1

object session2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(362); 

def countChange(money: Int, coins: List[Int]): Int = {
	if (money == 0) 1
	else if (money < 0 || coins.isEmpty) 0
//	else for (i <- 1 to (math floor (money/(coins.head) ))) {
//				countChange(money - i*coins.head, coins.tail)
//				}
	else {
	 countChange(money, coins.tail) + countChange(money - coins.head, coins)
	
	}
	


};System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(27); val res$0 = 
countChange(6,List(1,3,2));System.out.println("""res0: Int = """ + $show(res$0))}

}
