class HigherOrderFunction {}

fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {

    return operation(num1, num2)
}


fun plus(num1: Int, num2: Int) = num1 + num2

fun minus(num1: Int, num2: Int) = num1 - num2

fun div(num1: Int, num2: Int) = num1 / num2


fun main(args: Array<String>) {

    val num1 = 100
    val num2 = 80

    // val result1 = num1AndNum2(num1, num2, ::plus)
    val result1 = num1AndNum2(num1, num2) { n1, n2 -> n1 + n2 }

    // val result2 = num1AndNum2(num1, num2, ::minus)
    val result2 = num1AndNum2(num1, num2) { n1, n2 -> n1 - n2 }


    val result3 = num1AndNum2(num1, num2, ::div)

    println("result1 = $result1")
    println("result2 = $result2")
    println("result3 = $result3")


    // =================================================================================================================

    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")

    val result = StringBuilder().build {
        append("开始吃水果\n")
        for (item in list) {
            append("$item\n")
        }
        append("吃完了")
    }

    println(result.toString())


}

/**
 *
 */
fun StringBuilder.build(block: StringBuilder.() -> Unit): StringBuilder {
    block()
    return this
}


