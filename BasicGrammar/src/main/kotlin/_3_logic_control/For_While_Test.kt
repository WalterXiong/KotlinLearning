package _3_logic_control

/**
 * 循环语句 for-in 循环
 */


/**
 * java 中没有的区间
 * 表示 [0, 10] 的闭区间
 */
val range = 0..10

/**
 * 左闭右开的区间：[0, 10)
 * 0,1,2,3,4,5,6,7,8,9
 */
val range1 = 0 until 10


/**
 * 闭区间，但是是降序的 [10, 1]
 */
val range2 = 10 downTo 0

fun main() {

    for (i in 0..10) {
        println(i)
    }

    println("============================================================")

    // 步长为 2 的遍历
    for (i in 0 until 10 step 2) {
        println(i)
    }

    println("============================================================")

    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}
