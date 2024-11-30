package _7_kotlin_magic

class FuctionDefaultValue {

}

fun printParams(number: Int, str: String = "hello") {
    println("number is $number, str is $str")
}

fun printParams1(number: Double = 1.0, name: String) {
    println("number is $number, name is $name")
}

fun main() {

    printParams(123)
    println("==============================")
    printParams1(name = "world")
}