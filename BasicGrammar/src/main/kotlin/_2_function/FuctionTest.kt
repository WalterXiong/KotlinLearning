package _2_function

import kotlin.math.max

class FuctionTest {
}

// 无参数，无返回值，方法
fun myFunction() {
}

// 有参数，无返回值，方法
fun myFunction(param1: Int) {
}

// 多参数，有返回值，方法
fun largeNumber(param1: Int, param2: Int): Int {
    return max(param1, param2)
}

// 简写
fun largeNumber1(param1: Int, param2: Int): Int = max(param1, param2)

// 还可以简写
fun largeNumber2(param1: Int, param2: Int) = max(param1, param2)






