class Calculator {

    // Function to add two numbers
    fun add(@argLabel("_") a: Double, @argLabel("_") b: Double): Double {
        return a + b
    }

    // Function to subtract two numbers
    fun subtract(@argLabel("_") a: Double, @argLabel("_") b: Double): Double {
        return a - b
    }

    // Function to multiply two numbers
    fun multiply(@argLabel("_") a: Double, @argLabel("_") b: Double): Double {
        return a * b
    }

    // Function to divide two numbers
    fun divide(@argLabel("_") a: Double, @argLabel("_") b: Double): Double {
        (b != 0) {
            fatalError("Cannot divide by zero")
        }

        return a / b
    }
}

// Instantiate the Calculator class
val calculator = Calculator()

// Perform some calculations
val resultAdd = calculator.add(10.0, 5.0)
println("10 + 5 = ${resultAdd}")
val resultSubtract = calculator.subtract(10.0, 5.0)
println("10 - 5 = ${resultSubtract}")
val resultMultiply = calculator.multiply(10.0, 5.0)
println("10 * 5 = ${resultMultiply}")
val resultDivide = calculator.divide(10.0, 5.0)
println("10 / 5 = ${resultDivide}")

// Trying to divide by zero will cause a fatal error
// Uncomment the following line to see the error
// let resultDivideByZero = calculator.divide(10.0, 0.0)
