package _5_lambda

fun main() {

    // 不可变集合
    val fixedList = listOf("西瓜", "葡萄", "火龙果", "猕猴桃", "百香果", "樱桃", "桃子")
    for (fruit in fixedList) {
        println(fruit)
    }

    // 可变集合
    val mutableList = mutableListOf("西瓜", "葡萄", "火龙果", "猕猴桃", "百香果", "樱桃", "桃子")
    mutableList.add("牛油果")
    for (fruit in mutableList) {
        println(fruit)
    }


    // =================================================================================================================

    // 不可变 Set
    val fixedSet = setOf("西瓜", "葡萄", "火龙果", "猕猴桃", "百香果", "樱桃", "桃子")
    for (fruit in fixedSet) {
        println(fruit)
    }

    // 可变 Set
    val mutableSet = mutableSetOf("西瓜", "葡萄", "火龙果", "猕猴桃", "百香果", "樱桃", "桃子")
    mutableSet.add("牛油果")
    for (fruit in mutableSet) {
        println(fruit)
    }

    // =================================================================================================================

    val orgMap = HashMap<String, Int>()
    orgMap["熊峻"] = 1
    orgMap["刘赵银"] = 2

    val mapOf = mapOf("xj" to 1, "lzy" to 2)

    for ((name, number) in mapOf) {
        println("name is " + name + ", number is " + number)
    }
}