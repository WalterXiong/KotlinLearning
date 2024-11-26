package _4_object_oriented


open class PersonTest {

    var name = ""
    var age = 0

    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }


}

fun main() {

    // 初始化我们自己创建的类
    val personTest = PersonTest()
    personTest.age = 29
    personTest.name = "熊峻"
    personTest.eat()

}



