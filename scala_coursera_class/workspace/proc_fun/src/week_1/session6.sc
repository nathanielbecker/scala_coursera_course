package week_1
import math.abs
object session6 {
val tolerance = .0001                             //> tolerance  : Double = 1.0E-4
def isCloseEnough (x: Double, y: Double) =
	abs((x-y)/x)/x < tolerance                //> isCloseEnough: (x: Double, y: Double)Boolean

def fixedPoint(f: Double => Double)(firstGuess: Double) = {
def iterate (guess: Double): Double = {
val next = f(guess)
if (isCloseEnough(guess,next)) next
else iterate(next)

}
iterate(firstGuess)
}                                                 //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
//fixedPoint(x=> x/f(x))(1)
def averageDamp (f: Double => Double)(x: Double) = (x + f(x))/2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

def sqrty(x: Double) = fixedPoint(x=> 1 + x/2)(1) //> sqrty: (x: Double)Double
sqrty(2)                                          //> res0: Double = 1.999755859375
}