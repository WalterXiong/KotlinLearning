package delegates

import kotlin.reflect.KProperty

/**
 * 属性委托
 */
class AttributeDelegateTest {

    /**
     * var  变量 委托
     */
    var p by Delegate()


    /**
     * val  变量 委托
     */
    val c by later {
        val match = MatchGroup("", 1..2)
        match
    }
}

class Delegate {
    private var propValue: Any? = null

    /**
     * 第一个参数：用于声明该Delegate类的委托功能可以在什么类中使用，这里写成MyClass表示仅可在MyClass类中使用；
     * 第二个参数：KProperty<*>是 Kotlin 中的一个属性操作类，可用于获取各种属性相关的值，在当前场景下用不着，但是必须在方法参数上进行声明。
     */
    operator fun getValue(
        attributeDelegateTest: AttributeDelegateTest, property: KProperty<*>
    ): Any? {
        return propValue
    }

    /**
     * 第一个参数：用于声明该Delegate类的委托功能可以在什么类中使用，这里写成MyClass表示仅可在MyClass类中使用；
     * 第二个参数：KProperty<*>是 Kotlin 中的一个属性操作类，可用于获取各种属性相关的值，在当前场景下用不着，但是必须在方法参数上进行声明。
     * 第三个参数：表示具体要赋值给委托属性的值，这个参数的类型必须和 getValue() 方法返回值的类型保持一致。
     *
     */
    operator fun setValue(
        attributeDelegateTest: AttributeDelegateTest, property: KProperty<*>, any: Any?
    ) {
        propValue = any
    }

}


fun main(args: Array<String>) {

    val attr = AttributeDelegateTest()

    attr.p = 1

    attr.c

}
