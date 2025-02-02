```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    if (x > 0) {
      value + x
    } else {
      throw new IllegalArgumentException("x must be positive")
    }
  }
}
```