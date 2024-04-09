fun <T : Comparable<T>> mergeSort(array: List<T>): List<T> {
    if (array.size <= 1) return array
    val mid = array.size / 2
    val left = mergeSort(array.subList(0, mid))
    val right = mergeSort(array.subList(mid, array.size))
    return merge(left, right)
}

fun <T : Comparable<T>> merge(left: List<T>, right: List<T>): List<T> {
    val merged = mutableListOf<T>()
    var lIndex = 0
    var rIndex = 0

    while (lIndex < left.size && rIndex < right.size) {
        if (left[lIndex] < right[rIndex]) {
            merged.add(left[lIndex])
            lIndex++
        } else {
            merged.add(right[rIndex])
            rIndex++
        }
    }

    // Add remaining elements
    while (lIndex < left.size) {
        merged.add(left[lIndex])
        lIndex++
    }
    while (rIndex < right.size) {
        merged.add(right[rIndex])
        rIndex++
    }

    return merged
}

// Example usage
fun main() {
    val unsortedArray = listOf(5, 2, 8, 1, 3)
    val sortedArray = mergeSort(unsortedArray)
    println(sortedArray) // Output: [1, 2, 3, 5, 8]
}
