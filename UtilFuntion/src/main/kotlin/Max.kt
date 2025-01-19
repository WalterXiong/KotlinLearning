import kotlin.math.max

/**
 * 取多个数字中的最大最小值的工具方法
 */
class Max {
}

fun main() {


    val a = 10
    val b = 8
    val c = 20

    val max = max(max(a, b), c)

    val max1 = max(a, b, c)

    val max2 = max(0.14, 0.02, 0.8)
}


fun <T : Comparable<T>> max(vararg nums: T): T {
    if (nums.isEmpty()) {
        throw IllegalArgumentException("nums can not be empty")
    }
    var maxNum = nums[0]

    for (num in nums) {
        if (num > maxNum) {
            maxNum = num
        }
    }
    return maxNum
}