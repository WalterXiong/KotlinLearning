class Infix {

}


infix fun String.beginsWith(prefix: String) = startsWith(prefix)


infix fun <T> Collection<T>.has(element: T) = contains(element)


/**
 * 模仿 to() 函数
 */

infix fun <K, V> K.with(that: V) = Pair<K, V>(this, that)


fun main() {


    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    if (list has "Apple") {
        println("aaa")
    }

    mapOf("a" to "b", "c" to "d", "d" to "e", "e" to "f", "f" to "g")

    mapOf("a" with "b", "c" with "d", "e" with "f")
}