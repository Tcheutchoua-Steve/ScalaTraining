package example

object overrides{
  println("Welcome to the Scala worksheet")
}

abstract class Base {
  def foo = 1
  def bar: Int
}

class Sub extends Base {
  override def foo = 2
  // override optional since it implements definition of supper class
  def bar = 3
}

// singleton objects are (evaluates to) values