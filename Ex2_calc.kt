// Calculator class representing a basic calculator with add, subtract, multiply, and divide operations
class Calculator {

    // Function to add two numbers
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    // Function to subtract two numbers
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    // Function to multiply two numbers
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    // Function to divide two numbers
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return a / b
    }
}

fun main() {
    val calculator = Calculator()

    // Perform some calculations
    val resultAdd = calculator.add(10.0, 5.0)
    println("10 + 5 = $resultAdd")

    val resultSubtract = calculator.subtract(10.0, 5.0)
    println("10 - 5 = $resultSubtract")

    val resultMultiply = calculator.multiply(10.0, 5.0)
    println("10 * 5 = $resultMultiply")

    val resultDivide = calculator.divide(10.0, 5.0)
    println("10 / 5 = $resultDivide")

    // Trying to divide by zero will throw an exception
    try {
        val resultDivideByZero = calculator.divide(10.0, 0.0)
        println("10 / 0 = $resultDivideByZero")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
