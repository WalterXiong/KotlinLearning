package _4_object_oriented

import _4_object_oriented.SingletonObject.singletonTest

/**
 *  数据类 与 单例
 */
class DataAndSingleton {

}

/**
 * 数据类
 */
data class Cellphone(val brand: String, val price: Double)

/**
 * 单例类
 */
object SingletonObject {

    fun singletonTest() {
        println("singletonTest is called （单例测试函数已经被调用了）")
    }

}


fun main(args: Array<String>) {

    SingletonObject.singletonTest()
}