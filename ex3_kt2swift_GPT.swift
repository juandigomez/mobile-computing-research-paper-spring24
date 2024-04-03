func reverseString(_ s: inout [Character]) {
    var pointA = 0
    var pointB = s.count - 1
    
    while pointA <= pointB {
        let tempVal = s[pointA]
        s[pointA] = s[pointB]
        s[pointB] = tempVal
        
        pointA += 1
        pointB -= 1
    }
}

var charArray: [Character] = ["a", "b", "c", "d", "e"]
print("Original array: \(charArray)")
    
// Reverse the array
reverseString(&charArray)
print("Reversed array: \(charArray)")
