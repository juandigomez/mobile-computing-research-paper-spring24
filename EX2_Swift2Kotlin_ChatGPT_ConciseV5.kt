fun main() = Calculator().run {
    println("10 + 5 = ${add(10.0, 5.0)}")
    println("10 - 5 = ${subtract(10.0, 5.0)}")
    println("10 * 5 = ${multiply(10.0, 5.0)}")
    println("10 / 5 = ${divide(10.0, 5.0)}")
}

class Calculator {
    fun add(a: Double, b: Double) = a + b
    fun subtract(a: Double, b: Double) = a - b
    fun multiply(a: Double, b: Double) = a * b
    fun divide(a: Double, b: Double) = a / b
}
