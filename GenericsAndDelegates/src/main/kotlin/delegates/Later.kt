package delegates

import kotlin.reflect.KProperty

/**
 * 自己实现一个 lazy 函数
 */
class Later<T>(val block: () -> T) {

    private var value: Any? = null

    operator fun getValue(any: Any?, property: KProperty<*>): T? {

        if (value == null) {
            value = block()
        }

        return value as T
    }
}

/**
 * 创建一个顶层方法
 */
fun <T> later(block: () -> T) = Later(block)