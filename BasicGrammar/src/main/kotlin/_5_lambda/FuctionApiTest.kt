package _5_lambda

import java.util.*


/**
 * lambda 语法结构
 *
 * { 参数名1: 参数类型, 参数名2参: 数类类型 -> 函数体 }
 *
 */

fun main() {


    val list = listOf("watermelon", "葡萄", "火龙果", "猕猴桃", "百香果", "樱桃", "桃子")
    val lambda = { fruit: String -> fruit.length }
    val maxLengthFruit = list.maxBy(lambda)

    val maxLengthFruit1 = list.maxBy({ fruit: String -> fruit.length })

    val maxLengthFruit2 = list.maxBy() { fruit: String -> fruit.length }

    val maxLengthFruit3 = list.maxBy { fruit: String -> fruit.length }

    val maxLengthFruit4 = list.maxBy { fruit -> fruit.length }

    val maxLengthFruit5 = list.maxBy { it.length }


    // ================================== map 和 filter 函数 ============================================================

    val newList = list.map { it.uppercase(Locale.getDefault()) }
    for (fruit in newList) {
        println(fruit)
    }
    println("=================================================")

    val newList1 = list
        .filter { it.length >= 3 }
        .map { it.uppercase(Locale.getDefault()) }
    for (fruit in newList1) {
        println(fruit)
    }
    println("=================================================")


    // ================================== any 和 all 函数 ===============================================================

    val any = list.any { it.length > 3 }
    val all = list.all { it.length > 3 }
    println("any is: $any, all is: $all")

}