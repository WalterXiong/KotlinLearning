package higherorderfunction_application


class SharedPreferences {

    fun edit(): SharedPreferences.Editor {
        return this.edit()
    }

    inner class Editor {

        fun apply() {}
    }
}

fun SharedPreferences.open(block: SharedPreferences.Editor.() -> Unit) {
    val edit = edit()
    edit.block()
    edit.apply()
}