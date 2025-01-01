package delegates

/**
 * 类委托
 */
class ClassDelegateTest {
}

class ContentValues<K, V>(private val helperMap: HashMap<K, V>) : MutableMap<K, V> by helperMap {

    constructor() : this(HashMap())

    fun putNull(key: K) {}

}


fun cvOf(vararg pairs: Pair<String, Any?>) = ContentValues<String, Any?>().apply {

    for (pair in pairs) {

        val key = pair.first

        when (val value = pair.second) {
            is Short -> put(key, value)
            is Int -> put(key, value)
            is Long -> put(key, value)
            is Float -> put(key, value)
            is Double -> put(key, value)
            is Boolean -> put(key, value)
            is String -> put(key, value)
            is Byte -> put(key, value)
            is ByteArray -> put(key, value)
            null -> putNull(key)
        }
    }
}