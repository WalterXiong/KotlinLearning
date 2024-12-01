package standard_function


fun main() {

    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")

    /**
     *  with 函数
     *
     */
    val withResult = with(StringBuilder()) {

        append("Start eating fruits.\n")

        for (fruit in list) {
            append(fruit).append("\n")
        }

        append("Ate all fruits.")

        toString()
    }
    println(withResult)


    /**
     * run 函数
     *
     */
    val runResult = StringBuilder().run {

        append("Start eating fruits.\n")

        for (fruit in list) {
            append(fruit).append("\n")
        }

        append("Ate all fruits.")

        toString()
    }
    println(runResult)


    /**
     * apply 函数
     *
     */
    val applyResult = StringBuilder().run {

        append("Start eating fruits.\n")

        for (fruit in list) {
            append(fruit).append("\n")
        }

        append("Ate all fruits.")
    }
    println(applyResult.toString())

}
