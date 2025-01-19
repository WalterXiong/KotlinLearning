import javax.naming.Context
import kotlin.coroutines.jvm.internal.CompletedContinuation.context
import kotlin.time.Duration


fun String.showToast(context: Context, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, this, duration).show()
}

fun Int.showToast(context: Context, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, this, duration).show()
}


fun View.showSnackBar(
    text: String,
    actionText: String? = null,
    duration: Int = Snackbar.LENGTH_SHORT,
    block: (() -> Unit)? = null
) {
    val bar = Snackbar.make(this, text, duration)
    if (actionText != null && block != null) {
        bar.setAction(actionText) {
            block()
        }
    }
    bar.show()
}

fun View.showSnackBar(
    resId: Int,
    actionText: String? = null,
    duration: Int = Snackbar.LENGTH_SHORT,
    block: (() -> Unit)? = null
) {
    val bar = Snackbar.make(this, resId, duration)
    if (actionText != null && block != null) {
        bar.setAction(actionText) {
            block()
        }
    }
    bar.show()
}

fun main() {



    "我是谁".showToast(this)

}
