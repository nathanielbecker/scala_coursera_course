package week_1

object session4 {
def sumo(f:Int => Int, a: Int, b: Int): Int = {
	def loop (a: Int, acc: Int): Int = {
	if (a - b > 0) acc
	else loop (a + 1,f(a) + acc )
	}
loop(a,0)


}                                                 //> sumo: (f: Int => Int, a: Int, b: Int)Int

sumo(x => x , 1, 4)                               //> res0: Int = 10

}