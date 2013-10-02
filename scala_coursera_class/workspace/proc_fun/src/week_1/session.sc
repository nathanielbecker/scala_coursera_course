package week_1

object session {


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

}                                                 //> balance: (chars: List[Char])Boolean
balance("(just an) example".toList)               //> res0: Boolean = true



}