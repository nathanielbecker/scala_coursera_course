package week_1

object session2 {

def countChange(money: Int, coins: List[Int]): Int = {
	if (money == 0) 1
	else if (money < 0 || coins.isEmpty) 0
//	else for (i <- 1 to (math floor (money/(coins.head) ))) {
//				countChange(money - i*coins.head, coins.tail)
//				}
	else {
	 countChange(money, coins.tail) + countChange(money - coins.head, coins)
	
	}
	


}                                                 //> countChange: (money: Int, coins: List[Int])Int
countChange(6,List(1,3,2))                        //> res0: Int = 7

}