func mergeSort<T: Comparable>(_ array: inout [T]) {
    guard array.count > 1 else { return }
    
    let mid = array.count / 2
    var left = Array(array[..<mid])
    var right = Array(array[mid...])
    
    mergeSort(&left)
    mergeSort(&right)
    
    merge(&array, &left, &right)
}

private func merge<T: Comparable>(_ array: inout [T], _ left: inout [T], _ right: inout [T]) {
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

var unsortedList = [5, 2, 8, 1, 3]
mergeSort(&unsortedList)
print(unsortedList) // Output: [1, 2, 3, 5, 8]
