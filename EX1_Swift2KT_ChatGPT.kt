fun <T : Comparable<T>> mergeSort(array: List<T>): List<T> {
    if (array.size <= 1) return array // Base case: already sorted
    
    val midIndex = array.size / 2
    val left = mergeSort(array.subList(0, midIndex))
    val right = mergeSort(array.subList(midIndex, array.size))
    
    return merge(left, right)
}

fun <T : Comparable<T>> merge(left: List<T>, right: List<T>): List<T> {
    val merged = mutableListOf<T>()
    var leftIndex = 0
    var rightIndex = 0
    
    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] < right[rightIndex]) {
            merged.add(left[leftIndex])
            leftIndex++
        } else {
            merged.add(right[rightIndex])
            rightIndex++
        }
    }
    
    merged.addAll(left.subList(leftIndex, left.size))
    merged.addAll(right.subList(rightIndex, right.size))
    
    return merged
}

// Example usage
fun main() {
    val unsortedArray = listOf(5, 2, 8, 1, 3)
    val sortedArray = mergeSort(unsortedArray)
    println(sortedArray) // Output: [1, 2, 3, 5, 8]
}
