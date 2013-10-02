package week_1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(440); 


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

};System.out.println("""balance: (chars: List[Char])Boolean""");$skip(36); val res$0 = 
balance("(just an) example".toList);System.out.println("""res0: Boolean = """ + $show(res$0))}



}
