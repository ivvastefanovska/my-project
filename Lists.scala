package week4

import java.util.NoSuchElementException


trait List[Int] {
  def isEmpty: Boolean
  def head: Int
  def tail: List[Int]
}

class Cons[Int](val head: Int, val tail: List[Int]) extends List[Int]{
  def isEmpty:Boolean= false

}

class Nil[Int] extends List[Int]{
  def isEmpty: Boolean= true
  def head: Nothing= throw new NoSuchElementException("Nil.head")
  def tail: Nothing= throw new NoSuchElementException("Nil.tail")
}