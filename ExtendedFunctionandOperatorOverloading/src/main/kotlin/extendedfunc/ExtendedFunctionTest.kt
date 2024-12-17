package extendedfunc

import operation_overload.Money

/**
 *
 * 扩展函数
 *
 * 扩展函数标准结构：
 *
 * fun ClassName.methodName(param1: Int, param2: Int): Int {
 *     return 0
 * }
 *
 * 但是我建议向哪个类中添加扩展函数，就定义一个同名的Kotlin文件，这样便于你以后查找
 *
 */

fun String.lettersCount(): Int {
    var count = 0

    for (c in this) {
        if (c.isLetter()) {
            count++
        }
    }

    return count
}


//operator fun String.times(n: Int): String {
//
//    val b = StringBuilder()
//    repeat(n) {
//        b.append(this)
//    }
//
//    return b.toString()
//}

operator fun String.times(n: Int) = repeat(n)

fun main(args: Array<String>) {

    val str = "AbCde-"

    val count = str.lettersCount()
    println(count)

    println(str * 3)
}