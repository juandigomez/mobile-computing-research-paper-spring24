fun reverseString(s: MutableList<Char>) {
    var left = 0
    var right = s.size - 1
    
    while (left < right) {
        s[left] = s[right].also { s[right] = s[left] }
        left++
        right--
    }
}

fun main() {
    var charArray = mutableListOf('a', 'b', 'c', 'd', 'e')
    println("Original array: $charArray")
    
    // Reverse the array
    reverseString(charArray)
    println("Reversed array: $charArray")
}
