package higherorderfunction_application


class SharedPreferences {

}

fun SharedPreferences.open(block: SharedPreferences.Editor.() -> Unit) {
    var edit = edit()
    edit.block()
    edit.apply()
}