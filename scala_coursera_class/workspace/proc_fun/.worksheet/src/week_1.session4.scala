package week_1

object session4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(187); 
def sumo(f:Int => Int, a: Int, b: Int): Int = {
	def loop (a: Int, acc: Int): Int = {
	if (a - b > 0) acc
	else loop (a + 1,f(a) + acc )
	}
loop(a,0)


};System.out.println("""sumo: (f: Int => Int, a: Int, b: Int)Int""");$skip(21); val res$0 = 

sumo(x => x , 1, 4);System.out.println("""res0: Int = """ + $show(res$0))}

}
