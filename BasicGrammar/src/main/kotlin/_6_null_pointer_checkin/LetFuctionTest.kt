package _6_null_pointer_checkin


val studyLetTest: StudyNullPointerTest? = null


fun main() {

}

fun doStudyLetTest() {

    // studyLetTest?.let { stu ->
    // stu.readBooks()
    // stu.doHomework()
    // }

    studyLetTest?.let {
        it.readBooks()
        it.doHomework()
    }
}