```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    if (x > 0) {
      value + x
    } else {
      println("Warning: Input x is non-positive. Returning default value.")
      0 // Or some other default value 
    }
  }
}
```