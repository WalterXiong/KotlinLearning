package _4_object_oriented

import _4_object_oriented.PersonNon as PersonNon1

/**
 * 继承 与 构造函数
 */
class InheritanceAndConstructors {

}

// Student 类继承了 PersonTest
//class Student : PersonTest() {
//    var sno = ""
//    var grade = ""
//}

/**
 * 主构造函数
 * 特点：没有函数体，直接定义在类名后面
 */
//class Student1(val sno: String, val gradel: Int) : PersonTest() {
//    init {
//        println("主构造函数没有结构体，主构造函数里的逻辑都可以写在这个 init{} 结构体中")
//    }
//}

class Student1(val sno: String, val gradel: Int, name: String, age: Int) : PersonTest(name, age) {
    init {
        println("主构造函数没有结构体，主构造函数里的逻辑都可以写在这个 init{} 结构体中")
    }

    constructor(name: String, age: Int) : this("a666", 6, name, age) {
    }

    constructor() : this("刘赵银", 27) {
    }
}

fun main(args: Array<String>) {

    // 默认的主构造函数
    // var student = Student()

    // 自定义了主构造函数，在实例化类的时候必须传参
    // var student1 = Student1("1", 2)
    var student1 = Student1("a123", 6, "熊峻", 29)

    var student2 = Student1("王小明", 29)

    var student3 = Student1()

    println(student1.sno + " :: " + student1.gradel + " :: " + student1.name + " :: " + student1.age)
    println()
    println(student2.sno + " :: " + student2.gradel + " :: " + student2.name + " :: " + student2.age)
    println()
    println(student3.sno + " :: " + student3.gradel + " :: " + student3.name + " :: " + student3.age)

}