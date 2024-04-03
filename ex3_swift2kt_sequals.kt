fun reverseString(@argLabel("_") s: MutableList<Character>) {
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

val charArray: MutableList<Character> = mutableListOf("a", "b", "c", "d", "e")
println("Original array: ${charArray}")

// Reverse the array
reverseString(charArray)
println("Reversed array: ${charArray}")
