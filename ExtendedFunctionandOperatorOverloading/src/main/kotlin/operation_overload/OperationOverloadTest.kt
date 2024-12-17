package operation_overload

/**
 * 运算符重载
 *
 *
 * 运算符重载的基本语法：
 *
 * class Obj {
 *     operator fun plus(o: Obj): Obj {
 *         // 处理相加的逻辑
 *     }
 * }
 *
 *
 *
 */
class OperationOverloadTest {}

class Money(val value: Int) {

    operator fun plus(money: Money): Money {
        return Money(value + money.value)
    }

    operator fun plus(newValue: Int): Money {
        return Money(value + newValue)
    }


}


fun main() {

    val money1 = Money(1)
    val money2 = Money(2)
    val money3 = money1 + money2

    println(money3.value)

    val money4 = money3 + 20

    println(money4.value)
}

