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
  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: Int => Boolean, elem: Int)Boolean

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = {
    set => set == elem
  }                                               //> singletonSet: (elem: Int)Int => Boolean
  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = {
     crappydo => (s(crappydo)) || (t(crappydo)  )
  }                                               //> union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = {
     crappydo => (s(crappydo)) && (t(crappydo)  )
  }                                               //> intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set = {
     crappydo => (s(crappydo)) && !(t(crappydo)  )
  }                                               //> diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = {
    crappydo => (s(crappydo)) && (p(crappydo)  )
    
  }                                               //> filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000                                //> bound  : Int = 1000

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
  }                                               //> forall: (s: Int => Boolean, p: Int => Boolean)Boolean

  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = !forall(s,!p(_) )
                                                  //> exists: (s: Int => Boolean, p: Int => Boolean)Boolean


  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = {
    crappydo => exists(s, zing => zing == f(crappydo))
     }                                            //> map: (s: Int => Boolean, f: Int => Int)Int => Boolean
  
  
  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }                                               //> toString: (s: Int => Boolean)String

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  }                                               //> printSet: (s: Int => Boolean)Unit
  val s = singletonSet(1)                         //> s  : Int => Boolean = <function1>
  
  contains(s, 1)                                  //> res0: Boolean = true
  
  val t = singletonSet(2)                         //> t  : Int => Boolean = <function1>
  val u = union(s, t)                             //> u  : Int => Boolean = <function1>
  val i = intersect(s, t)                         //> i  : Int => Boolean = <function1>
  contains(u, 1)                                  //> res1: Boolean = true
  contains(u, 2)                                  //> res2: Boolean = true
  contains(u, 3)                                  //> res3: Boolean = false
  contains(u, 4)                                  //> res4: Boolean = false
 
  val s1 = singletonSet(1)                        //> s1  : Int => Boolean = <function1>
  val s2 = singletonSet(2)                        //> s2  : Int => Boolean = <function1>
  val s3 = singletonSet(3)                        //> s3  : Int => Boolean = <function1>
  
  toString(map(union(union(s1, s2), s3), x => 2*x))
                                                  //> res5: String = {1}
  
  val ss = union(union(s1, s2), s3)               //> ss  : Int => Boolean = <function1>
  contains(ss, 1)                                 //> res6: Boolean = true
  contains(ss, 2)                                 //> res7: Boolean = true


}