package week_1

object session5 {
def product (f: Int =>Int) (a: Int, b: Int): Int = {
	if (a >b) 1
	else  f(a) * product(f)(a+1,b)
}                                                 //> product: (f: Int => Int)(a: Int, b: Int)Int
product(x =>x) (1,6)                              //> res0: Int = 720


def fact(n: Int): Int = {
product(x =>x) (1,n)

}                                                 //> fact: (n: Int)Int

def shazam (f: Int =>Int, g: (Int, Int) => Int, identify: Int) (a: Int, b: Int): Int = {
	if (a >b) identify
	else  g(f(a) , shazam(f, g, identify)(a+1,b))
}                                                 //> shazam: (f: Int => Int, g: (Int, Int) => Int, identify: Int)(a: Int, b: Int)
                                                  //| Int



}