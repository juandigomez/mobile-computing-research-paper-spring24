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
    func divide(_ a: Double, _ b: Double) throws -> Double {
        guard b != 0.0 else {
            throw NSError(domain: "CalculatorError", code: 0, userInfo: [NSLocalizedDescriptionKey: "Cannot divide by zero"])
        }
        return a / b
    }
}

let calculator = Calculator()

// Perform some calculations
let resultAdd = calculator.add(10.0, 5.0)
print("10 + 5 = \(resultAdd)")

let resultSubtract = calculator.subtract(10.0, 5.0)
print("10 - 5 = \(resultSubtract)")

let resultMultiply = calculator.multiply(10.0, 5.0)
print("10 * 5 = \(resultMultiply)")

do {
    let resultDivide = try calculator.divide(10.0, 5.0)
    print("10 / 5 = \(resultDivide)")
    
    // Trying to divide by zero will throw an exception
  let resultDivideByZero = try calculator.divide(10.0, 0.0)
    print("10 / 0 = \(resultDivideByZero)")
 } catch let error as NSError {
    print("Error: \(error.localizedDescription)")
}
