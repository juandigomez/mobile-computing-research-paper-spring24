fun reverseString(s: CharArray): Unit {
  var pointA = 0;
  var pointB = s.size -1;
  
  while (pointA <= pointB){
    val tempVal = s[pointA];
    s[pointA] = s[pointB];
    s[pointB] = tempVal;
    
    pointA++;
    pointB--;
  }
}
fun main() {
    val charArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    println("Original array: ${charArray.joinToString(", ")}")
    
    // Reverse the array
    reverseString(charArray)
    println("Reversed array: ${charArray.joinToString(", ")}")
}
