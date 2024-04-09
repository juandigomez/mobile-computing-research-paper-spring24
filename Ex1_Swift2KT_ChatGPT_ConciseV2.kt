fun <T : Comparable<T>> mergeSort(array: List<T>): List<T> =
    if (array.size <= 1) array
    else {
        val mid = array.size / 2
        merge(mergeSort(array.subList(0, mid)), mergeSort(array.subList(mid, array.size)))
    }

fun <T : Comparable<T>> merge(left: List<T>, right: List<T>): List<T> {
    var (lIndex, rIndex) = 0 to 0
    val merged = mutableListOf<T>()

    while (lIndex < left.size && rIndex < right.size) {
        merged += if (left[lIndex] < right[rIndex]) left[lIndex++] else right[rIndex++]
    }
    return merged.apply {
        addAll(left.subList(lIndex, left.size))
        addAll(right.subList(rIndex, right.size))
    }
}

// Example usage
fun main() {
    val unsortedArray = listOf(5, 2, 8, 1, 3)
    val sortedArray = mergeSort(unsortedArray)
    println(sortedArray) // Output: [1, 2, 3, 5, 8]
}
