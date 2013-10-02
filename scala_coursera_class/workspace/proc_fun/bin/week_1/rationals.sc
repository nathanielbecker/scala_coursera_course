package week_1

object rationals {
val x = new rational(1,3)                         //> x  : week_1.rational = 1/3
x.denom                                           //> res0: Int = 3
x.numer                                           //> res1: Int = 1
x.neg                                             //> res2: week_1.rational = -1/3

val y = new rational(5,7)                         //> y  : week_1.rational = 5/7


val z= new rational (3,2)                         //> z  : week_1.rational = 3/2
x.sub(y).sub(z)                                   //> res3: week_1.rational = -79/42

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