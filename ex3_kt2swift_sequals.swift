func reverseString(s: CharArray) {
    var pointA = 0
    var pointB = s.size - 1
    while pointA <= pointB {
        let tempVal = s[pointA]
        s[pointA] = s[pointB]
        s[pointB] = tempVal
        pointA += 1
        pointB -= 1
    }
}

func main() {
    let charArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    print("Original array: \(charArray.joinToString(", "))")

    // Reverse the array
    reverseString(s: charArray)
    print("Reversed array: \(charArray.joinToString(", "))")
}
