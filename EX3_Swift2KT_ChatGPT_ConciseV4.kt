fun main() {
    var charArray = mutableListOf('a', 'b', 'c', 'd', 'e')
    println("Original array: $charArray")
    
    // Reverse the array
    charArray = charArray.reversed().toMutableList()
    println("Reversed array: $charArray")
}
