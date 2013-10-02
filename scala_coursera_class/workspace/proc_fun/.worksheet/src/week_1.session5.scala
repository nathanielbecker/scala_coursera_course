package week_1

object session5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(133); 
def product (f: Int =>Int) (a: Int, b: Int): Int = {
	if (a >b) 1
	else  f(a) * product(f)(a+1,b)
};System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(21); val res$0 = 
product(x =>x) (1,6);System.out.println("""res0: Int = """ + $show(res$0));$skip(52); 


def fact(n: Int): Int = {
product(x =>x) (1,n)

};System.out.println("""fact: (n: Int)Int""");$skip(159); 

def shazam (f: Int =>Int, g: (Int, Int) => Int, identify: Int) (a: Int, b: Int): Int = {
	if (a >b) identify
	else  g(f(a) , shazam(f, g, identify)(a+1,b))
};System.out.println("""shazam: (f: Int => Int, g: (Int, Int) => Int, identify: Int)(a: Int, b: Int)Int""")}



}
