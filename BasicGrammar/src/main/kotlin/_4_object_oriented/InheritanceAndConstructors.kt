package _4_object_oriented

/**
 * 继承 与 构造函数
 */
class InheritanceAndConstructors {

}

// Student 类继承了 PersonTest
class Student : PersonTest() {
    var sno = ""
    var grade = ""
}

// 主构造函数
class Student1(val sno: String, val gradel: Int) : PersonTest() {
    init {
        println("主构造函数没有结构体，主构造函数里的逻辑都可以写在这个 init{} 结构体中")
    }
}


fun main(args: Array<String>) {

    // 默认的主构造函数
    var student = Student()

    // 自定义了主构造函数，在实例化类的时候必须传参
    var student1 = Student1("1", 2)


}