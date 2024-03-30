// Calculator class representing a basic calculator with add, subtract, multiply, and divide operations
class Calculator {

    // Function to add two numbers
    func add(_ a: Double, _ b: Double) -> Double {
        return a + b
    }

    // Function to subtract two numbers
    func subtract(_ a: Double, _ b: Double) -> Double {
        return a - b
    }

    // Function to multiply two numbers
    func multiply(_ a: Double, _ b: Double) -> Double {
        return a * b
    }

    // Function to divide two numbers
    func divide(_ a: Double, _ b: Double) -> Double {
        guard b != 0 else {
            fatalError("Cannot divide by zero")
        }
        return a / b
    }
}

// Instantiate the Calculator class
let calculator = Calculator()

// Perform some calculations
let resultAdd = calculator.add(10.0, 5.0)
print("10 + 5 = \(resultAdd)")

let resultSubtract = calculator.subtract(10.0, 5.0)
print("10 - 5 = \(resultSubtract)")

let resultMultiply = calculator.multiply(10.0, 5.0)
print("10 * 5 = \(resultMultiply)")

let resultDivide = calculator.divide(10.0, 5.0)
print("10 / 5 = \(resultDivide)")

// Trying to divide by zero will cause a fatal error
// Uncomment the following line to see the error
// let resultDivideByZero = calculator.divide(10.0, 0.0)
