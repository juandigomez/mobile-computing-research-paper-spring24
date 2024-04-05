// Calculator class representing a basic calculator with add, subtract, multiply, and divide operations
class Calculator {

    // Function to add two numbers
    func add(a: Double, b: Double) -> Double {
        return a + b
    }

    // Function to subtract two numbers
    func subtract(a: Double, b: Double) -> Double {
        return a - b
    }

    // Function to multiply two numbers
    func multiply(a: Double, b: Double) -> Double {
        return a * b
    }

    // Function to divide two numbers
    func divide(a: Double, b: Double) throws -> Double {
        if b == 0.0 {
            throw IllegalArgumentException("Cannot divide by zero")
        }

        return a / b
    }
}

func main() {
    let calculator = Calculator()

    // Perform some calculations
    let resultAdd = calculator.add(a: 10.0, b: 5.0)
    print("10 + 5 = \(resultAdd)")
    let resultSubtract = calculator.subtract(a: 10.0, b: 5.0)
    print("10 - 5 = \(resultSubtract)")
    let resultMultiply = calculator.multiply(a: 10.0, b: 5.0)
    print("10 * 5 = \(resultMultiply)")
    let resultDivide = try calculator.divide(a: 10.0, b: 5.0)
    print("10 / 5 = \(resultDivide)")

    // Trying to divide by zero will throw an exception
    do {
        let resultDivideByZero = try calculator.divide(a: 10.0, b: 0.0)
        print("10 / 0 = \(resultDivideByZero)")
    } catch let e as IllegalArgumentException {
        print("Error: \(e.message)")
    }
}

main()
