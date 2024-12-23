class NoinlineAndCrossinline {}

inline fun printString(str: String, block1: (str: String) -> Unit, noinline block2: (str: String) -> Unit) {
    println("开始打印")
    block1(str)
    println("结束打印")

    println("开始打印")
    block2(str)
    println("结束打印")
}

fun main() {

    println("main() 开始")

    val str = ""
    printString(

        str,

        // 内联函数
        { s ->
            println("内联函数 block1 lambda 开始")
            if (s.isEmpty()) {
                // 内联函数中可以使用 return 结束调用该函数的外层方法
                return
            }
            println(s)
            println("内联函数 block1 lambda 结束")

        },

        // 使用了 noinline 表示该函数不内联
        { s ->
            println("非-内联函数 block2 lambda 开始")
            if (s.isEmpty()) {
                // 非内联函数只能使用局部返回
                return@printString
            }
            println(s)
            println("非-内联函数 block2 lambda 结束")
        })

    println("main() 结束")


    // =================================================================================================================

    // 加上 crossinline 只要保证内联函数实现中没有 return 就行
    runRunnable {
        println("1")

        // 使用局部返回，正常
        return@runRunnable
    }

}


inline fun runRunnable(crossinline block: () -> Unit) {
    val runnable = Runnable {
        block()
    }
    runnable.run()
}