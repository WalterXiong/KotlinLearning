package static_method


/**
 * 第一种；实现类似静态方法的实现
 */
object PageUtil {

    fun doPage() {
        println("开始分页查询")
    }

}

/**
 * 第二种；实现类似静态方法的实现
 */

class ExcelUtil {

    companion object {

        fun readExcel() {
            println("开始分页查询")
        }
    }
}


/**
 * ========================== 静态方法实现：@JvmStatic 注解 ================================================================
 */
object PageUtilStatic {

    @JvmStatic
    fun doPage() {
        println("开始分页查询")
    }

}

/**
 * ========================== 静态方法实现：顶层方法 =======================================================================
 */
fun main() {

    // 这个就是顶层方法
    doSomething()
}

