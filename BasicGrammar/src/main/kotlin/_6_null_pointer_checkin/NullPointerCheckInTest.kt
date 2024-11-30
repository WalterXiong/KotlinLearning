package _6_null_pointer_checkin

/**
 * 辅助判空工具
 */

open class PersonNullPointerTest(val name: String, val age: Int) {}

interface StudyNullPointerTest {

    fun readBooks() {
        println("读书，（调用了接口的默认实现）")
    }

    fun doHomework()
}

class StudentNullPointerTest(name: String, age: Int) : PersonNullPointerTest(name, age), StudyNullPointerTest {

    override fun doHomework() {
        println(name + " doHomework !")
    }
}


fun main() {

    val student = StudentNullPointerTest("xj", 29)

    doStudyNullPointerTest(student)
}


// TODO 1. 辅助判空工具   ?.
fun doStudyNullPointerTest(study: StudyNullPointerTest?) {

    study?.readBooks()
    study?.doHomework()

}

//fun getTextLength(text: String?): Int = if (text != null) {
//    text.length
//} else {
//    0
//}

// TODO 2. 辅助判空工具   ?:
fun getTextLength(text: String?): Int = text?.length ?: 0


