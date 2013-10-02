package week_1
import math.abs
object session6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
val tolerance = .0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(71); 
def isCloseEnough (x: Double, y: Double) =
	abs((x-y)/x)/x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(201); 

def fixedPoint(f: Double => Double)(firstGuess: Double) = {
def iterate (guess: Double): Double = {
val next = f(guess)
if (isCloseEnough(guess,next)) next
else iterate(next)

}
iterate(firstGuess)
};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(92); 
//fixedPoint(x=> x/f(x))(1)
def averageDamp (f: Double => Double)(x: Double) = (x + f(x))/2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(51); 

def sqrty(x: Double) = fixedPoint(x=> 1 + x/2)(1);System.out.println("""sqrty: (x: Double)Double""");$skip(9); val res$0 = 
sqrty(2);System.out.println("""res0: Double = """ + $show(res$0))}
}
