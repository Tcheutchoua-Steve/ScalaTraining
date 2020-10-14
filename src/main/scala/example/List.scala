package example

trait List[T] {

  def isEmpty : Boolean
  def head : T
  def tail : List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T]{
  def isEmpty = false;
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tal")
}

/**
 * Type parameters do not affect evaluation in Scala
 * The difference between eval and the def concerns only the initialization.
 * Eval is evaluated when the object is first initialized. Where, whereas a def is evaluated each time it is referenced.
 * */
