fun main() {
    var charArray = mutableListOf('a', 'b', 'c', 'd', 'e')
    println("Original array: $charArray")
    
    // Reverse the array
    for (i in 0 until charArray.size / 2) {
        charArray[i] = charArray[charArray.size - 1 - i].also { charArray[charArray.size - 1 - i] = charArray[i] }
    }
    
    println("Reversed array: $charArray")
}
