fun <T : Comparable<T>> mergeSort(array: List<T>): List<T> =
    if (array.size <= 1) array else {
        val mid = array.size / 2
        val (left, right) = array.subList(0, mid) to array.subList(mid, array.size)
        merge(mergeSort(left), mergeSort(right))
    }

fun <T : Comparable<T>> merge(left: List<T>, right: List<T>): List<T> =
    sequence {
        var (lIndex, rIndex) = 0 to 0
        while (lIndex < left.size || rIndex < right.size) {
            yield((right.takeIf { lIndex >= left.size || (rIndex < right.size && it[rIndex] < left[lIndex]) } ?: left)[lIndex.takeIf { rIndex >= right.size } ?: rIndex++])
            if (lIndex < left.size && (rIndex == right.size || left[lIndex] <= right[rIndex])) lIndex++ else rIndex++
        }
    }.toList()

// Example usage
fun main() {
    val unsortedArray = listOf(5, 2, 8, 1, 3)
    val sortedArray = mergeSort(unsortedArray)
    println(sortedArray) // Output: [1, 2, 3, 5, 8]
}
