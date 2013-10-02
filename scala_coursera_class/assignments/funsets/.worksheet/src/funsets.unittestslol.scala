package funsets

object unittestslol {

import common._

/**
 * 2. Purely Functional Sets.
 */
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(347); 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(126); 

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = {
    set => set == elem
  };System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(210); 
  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = {
     crappydo => (s(crappydo)) || (t(crappydo)  )
  };System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(220); 

  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = {
     crappydo => (s(crappydo)) && (t(crappydo)  )
  };System.out.println("""intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(212); 

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set = {
     crappydo => (s(crappydo)) && !(t(crappydo)  )
  };System.out.println("""diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(172); 

  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = {
    crappydo => (s(crappydo)) && (p(crappydo)  )
    
  };System.out.println("""filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean""");$skip(88); 

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000;System.out.println("""bound  : Int = """ + $show(bound ));$skip(282); 

  /**
   * Returns whether all bounded integers within `s` satisfy `p`.
   */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a > bound) true
      else if (s(a) && !p(a) ) false
      else iter(a + 1)
    }
    iter(-1* bound)
  };System.out.println("""forall: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(170); 

  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = !forall(s,!p(_) );System.out.println("""exists: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(189); 


  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = {
    crappydo => exists(s, zing => zing == f(crappydo))
     };System.out.println("""map: (s: Int => Boolean, f: Int => Int)Int => Boolean""");$skip(190); 
  
  
  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  };System.out.println("""toString: (s: Int => Boolean)String""");$skip(117); 

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  };System.out.println("""printSet: (s: Int => Boolean)Unit""");$skip(26); 
  val s = singletonSet(1);System.out.println("""s  : Int => Boolean = """ + $show(s ));$skip(20); val res$0 = 
  
  contains(s, 1);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(29); 
  
  val t = singletonSet(2);System.out.println("""t  : Int => Boolean = """ + $show(t ));$skip(22); 
  val u = union(s, t);System.out.println("""u  : Int => Boolean = """ + $show(u ));$skip(26); 
  val i = intersect(s, t);System.out.println("""i  : Int => Boolean = """ + $show(i ));$skip(17); val res$1 = 
  contains(u, 1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(17); val res$2 = 
  contains(u, 2);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(17); val res$3 = 
  contains(u, 3);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(17); val res$4 = 
  contains(u, 4);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(29); 
 
  val s1 = singletonSet(1);System.out.println("""s1  : Int => Boolean = """ + $show(s1 ));$skip(27); 
  val s2 = singletonSet(2);System.out.println("""s2  : Int => Boolean = """ + $show(s2 ));$skip(27); 
  val s3 = singletonSet(3);System.out.println("""s3  : Int => Boolean = """ + $show(s3 ));$skip(55); val res$5 = 
  
  toString(map(union(union(s1, s2), s3), x => 2*x));System.out.println("""res5: String = """ + $show(res$5));$skip(39); 
  
  val ss = union(union(s1, s2), s3);System.out.println("""ss  : Int => Boolean = """ + $show(ss ));$skip(18); val res$6 = 
  contains(ss, 1);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(18); val res$7 = 
  contains(ss, 2);System.out.println("""res7: Boolean = """ + $show(res$7))}


}
