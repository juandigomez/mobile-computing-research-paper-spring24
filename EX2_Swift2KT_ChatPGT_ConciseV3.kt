fun main() {
    val calculator = Calculator()

    println("10 + 5 = ${calculator.add(10.0, 5.0)}")
    println("10 - 5 = ${calculator.subtract(10.0, 5.0)}")
    println("10 * 5 = ${calculator.multiply(10.0, 5.0)}")
    println("10 / 5 = ${calculator.divide(10.0, 5.0)}")

    // Trying to divide by zero will cause an exception
    // Uncomment the following line to see the error
    // val resultDivideByZero = calculator.divide(10.0, 0.0)
}

class Calculator {
    fun add(a: Double, b: Double) = a + b
    fun subtract(a: Double, b: Double) = a - b
    fun multiply(a: Double, b: Double) = a * b
    fun divide(a: Double, b: Double) = require(b != 0.0) { "Cannot divide by zero" }.let { a / b }
}
