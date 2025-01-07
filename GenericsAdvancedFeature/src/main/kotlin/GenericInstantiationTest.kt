class GenericInstantiationTest {
}


inline fun <reified T> getGenericType() = T::class.java


fun main(args: Array<String>) {

    val result1 = getGenericType<Int>()
    val result2 = getGenericType<String>()
    println(result1)
    println(result2)
}