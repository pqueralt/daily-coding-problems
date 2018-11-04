/** Given an array of integers, find the first missing positive integer in linear time and constant space. In other words,
find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers
as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place. */

fun main(args: Array<String>) {
    val inputs = arrayOf(
        arrayOf(3, 4, -1, 1),
        arrayOf(1, 2, 0),
        arrayOf(-5, -4, -3, -2, -1),
        arrayOf(500, 500, 500, 500),
        arrayOf(1,1,1,1,1,1)
    )

    for (input in inputs) {
        println("Lowest positive integer that does not exist in " + input.toList() + " is " + findLowestMissingInt(input))
    }
}

fun findLowestMissingInt(input: Array<Int>): Integer {
    input.sort()

    var lowestMissingInt = 1

    for (i in input) {
        if (i > 0 && i == lowestMissingInt) {
            lowestMissingInt = i + 1
        }
    }

    return Integer(lowestMissingInt)
}