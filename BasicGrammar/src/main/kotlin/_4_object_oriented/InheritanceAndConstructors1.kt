package _4_object_oriented


/**
 * 继承 与 构造函数
 */
class InheritanceAndConstructors1 {

}

open class PersonNon(val name: String, val age: Int) {
}

/**
 * 没有显示定义著构造函数
 * 只定义了次级构造函数，所以继承 PersonNon 的时候可以不写 （）
 */
class StudentNon : PersonNon {
    constructor(name: String, age: Int) : super(name, age) {}
}

fun main() {
    var student = StudentNon("xj", 29)
}
