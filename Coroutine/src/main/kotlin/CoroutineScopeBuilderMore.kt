import kotlinx.coroutines.*

class CoroutineScopeBuilderMore {

}


fun main() {


    /*val job = Job()
    val scope = CoroutineScope(job)
    scope.launch {
        // 处理具体的逻辑
    }
    job.cancel()*/


    /**
     * 使用  async await 获取协程执行的结果
     */
    /*runBlocking {

        val result = async {
            5 + 5
        }.await()

        println(result)
    }*/




    runBlocking {

//        val start = System.currentTimeMillis()
//
//        val result1 = async {
//            delay(1000)
//            5 + 5
//        }.await()
//
//        val result2 = async {
//            delay(1000)
//            5 + 5
//        }.await()
//
//        println("result is ${result1 + result2}")
//        val end = System.currentTimeMillis()
//        println("${end - start} ms")

        val start = System.currentTimeMillis()

        val result1 = async {
            delay(1000)
            5 + 5
        }

        val result2 = async {
            delay(1000)
            5 + 5
        }

        println("result is ${result1.await() + result2.await()}")
        val end = System.currentTimeMillis()
        println("${end - start} ms")
    }

}