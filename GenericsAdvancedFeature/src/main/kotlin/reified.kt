//import com.sun.tools.javac.util.Context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context
//
//class reified {
//
//    inline fun <reified T> startActivity(context: Context) {
//        val intent = Intent(context, T::class.java)
//        context.startActivity(intent)
//    }
//
//    inline fun <reified T> startActivity(context: Context, block: Intent.() -> Unit) {
//        val intent = Intent(context, T::class.java)
//        intent.block()
//        context.startActivity(intent)
//    }
//
//
//    fun test() {
//
//
//        startActivity<TestActivity>(context)
//
//
//        startActivity<TestActivity>(context) {
//            putExtra("param1", "data")
//            putExtra("param2", 123)
//        }
//    }
//}
//
//
//
//
//class MyInterface<out T>(val value: T) {
//
//    fun doingSomething(): T {
//        return this.value
//    }
//}