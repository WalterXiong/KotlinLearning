/**
 * 密封类
 */


// interface Result
// class Success(val msg: String) : Result
// class Failure(val error: Exception) : Result

sealed class Result
class Success(val msg: String) : Result()
class Failure(val error: Exception) : Result()
class Unkonw(val unkonw: Exception) : Result()


fun getResultMsg(result: Result) = when (result) {
    is Success -> result.msg
    is Failure -> result.error.message
    is Unkonw -> result.toString() // 必须添加对应的实现类的分支

    // 换成密封类之后，else 分支就可以去掉了
    // else -> throw IllegalArgumentException("Unknown result")
}

