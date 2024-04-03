func mergeSort<>(array: inout [T]) {
    if array.count <= 1 {
        return
    }

    let mid = array.count / 2
    let left = array.subList(0, mid).toMutableList()
    let right = array.subList(mid, array.count).toMutableList()
    mergeSort(array: &left)
    mergeSort(array: &right)
    merge(array: &array, left: left, right: right)
}

private func merge<>(array: inout [T], left: [T], right: [T]) {
    var i = 0
    var j = 0
    var k = 0
    while i < left.count && j < right.count {
        if left[i] <= right[j] {
            array[k] = left[i]
            i += 1
        } else {
            array[k] = right[j]
            j += 1
        }

        k += 1
    }

    while i < left.count {
        array[k] = left[i]
        i += 1
        k += 1
    }

    while j < right.count {
        array[k] = right[j]
        j += 1
        k += 1
    }
}

func main() {
    var unsortedList = [5, 2, 8, 1, 3]
    mergeSort(array: &unsortedList)
    print(unsortedList) // Output: [1, 2, 3, 5, 8]
}

main()
