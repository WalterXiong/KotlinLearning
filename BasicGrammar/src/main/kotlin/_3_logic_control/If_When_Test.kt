package _3_logic_control

/**
 * 程序的逻辑控制
 * 顺序语句、条件语句、循环语句
 */

fun main(args: Array<String>) {}

/**
 * ============================================== when 语句 =============================================================
 */
fun getScore(name: String): Int = when (name) {
    "熊峻" -> 100
    "刘赵银" -> 100
    "代凤英" -> 100
    else -> 0
}

// 不带参数的 when 写法
fun getScore1(name: String): Int = when {
    name.startsWith("熊") -> 100
    name == "刘赵银" -> 100
    name == "代凤英" -> 100
    else -> 0
}

// when 不仅支持精确匹配，还支持类型匹配
fun checkNumber(num: Number) = when (num) {
    is Int -> println("number is Int")
    is Double -> println("number is Double")
    else -> println("number not supported")
}


/**
 * ============================================== if 语句 ===============================================================
 */
fun largeNumber1(num1: Int, num2: Int): Int {

    var value = 0
    if (num1 > num2) {
        value = num1
    } else {
        value = num2
    }

    return value
}

fun largeNumber2(num1: Int, num2: Int): Int {

    val value = if (num1 > num2) {
        num1
    } else {
        num2
    }

    return value
}

fun largeNumber3(num1: Int, num2: Int): Int = if (num1 > num2) {
    num1
} else {
    num2
}

fun largeNumber4(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
