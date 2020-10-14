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

def error (msg: String) = throw new Error(msg)

val x = null
val y: String = null

//val z: Int = null
if (true) 1 else false