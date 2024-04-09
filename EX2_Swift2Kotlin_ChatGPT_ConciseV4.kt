fun main() {
    val calc = Calculator()
    println("10 + 5 = ${calc.add(10.0, 5.0)}")
    println("10 - 5 = ${calc.subtract(10.0, 5.0)}")
    println("10 * 5 = ${calc.multiply(10.0, 5.0)}")
    println("10 / 5 = ${calc.divide(10.0, 5.0)}")
}

class Calculator {
    fun add(a: Double, b: Double) = a + b
    fun subtract(a: Double, b: Double) = a - b
    fun multiply(a: Double, b: Double) = a * b
    fun divide(a: Double, b: Double) = a / b
}
