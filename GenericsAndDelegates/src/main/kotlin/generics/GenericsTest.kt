package generics

/**
 * 泛型
 */
class GenericsTest<T> {

    fun doSomething(param: T): T {
        println("调用--泛型类中的方法 $param")
        return param
    }
}


class MyClass {

    fun <T> doSomethingTow(param: T): T {
        println("调用--泛型方法 $param")
        return param
    }
}


fun main(args: Array<String>) {

    val myGenericsClass = GenericsTest<Int>()
    val result = myGenericsClass.doSomething(1)

    val myClass = MyClass()
    val result2 = myClass.doSomethingTow<Double>(2.0)

    val sb = StringBuilder().build {
        append(result)
        append("==================")
        append(result2)
    }
    println(sb.toString())

}


/**
 * 仿照 apply 函数的 泛型方法
 */
fun <T> T.build(block: T.() -> Unit): T {
    block()
    return this
}
