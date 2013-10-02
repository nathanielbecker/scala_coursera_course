package week_1

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
val x = new rational(1,3);System.out.println("""x  : week_1.rational = """ + $show(x ));$skip(8); val res$0 = 
x.denom;System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
x.numer;System.out.println("""res1: Int = """ + $show(res$1));$skip(6); val res$2 = 
x.neg;System.out.println("""res2: week_1.rational = """ + $show(res$2));$skip(27); 

val y = new rational(5,7);System.out.println("""y  : week_1.rational = """ + $show(y ));$skip(28); 


val z= new rational (3,2);System.out.println("""z  : week_1.rational = """ + $show(z ));$skip(16); val res$3 = 
x.sub(y).sub(z);System.out.println("""res3: week_1.rational = """ + $show(res$3))}

 }

class rational (x: Int, y: Int) {
require(y!=0, "denom ust be non-zero")
def numer = x
def denom = y


def add(that: rational) =
new rational(numer*that.denom + that.numer *denom, denom*that.denom)

def sub(that: rational) =
new rational(numer*that.denom - that.numer *denom, denom*that.denom)

def neg = new rational(- numer,denom)

override def toString = numer + "/" + denom

}
