fun reverseString(s: MutableList<Char>) {
    var pointA = 0
    var pointB = s.size - 1
    
    while (pointA <= pointB) {
        val tempVal = s[pointA]
        s[pointA] = s[pointB]
        s[pointB] = tempVal
        
        pointA++
        pointB--
    }
}

fun main() {
    var charArray = mutableListOf('a', 'b', 'c', 'd', 'e')
    println("Original array: $charArray")
    
    // Reverse the array
    reverseString(charArray)
    println("Reversed array: $charArray")
}
