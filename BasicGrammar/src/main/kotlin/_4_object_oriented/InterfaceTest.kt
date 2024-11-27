package _4_object_oriented

/**
 * 接口
 */

interface Study {

    fun readBooks()
    fun doHomework() {
        println("do homework default implementation（接口默认实现）")
    }

}

class Student(name: String, age: Int) : PersonTest(name, age), Study {

    override fun readBooks() {
        println(name + " is reading !")
    }

    // 有默认实现之后，实现类不用再强制实现该方法
//    override fun doHomework() {
//        println(name + " is doing homework !")
//    }
}


fun main() {
    // 实例化
    val student = Student("xj", 29)
    // 调用父类的方法
    student.eat()

    // 多态
    doStudy(student)
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}