import kotlinx.coroutines.*
import java.lang.Thread.sleep

class CoroutineTest {


}


fun main() {

    /**
     * 创建一个顶层协程
     */
    /*GlobalScope.launch {
    println("在协程范围内运行的代码")
    delay(1500)
    println("在协程范围内运行的代码，运行结束")
    }
    sleep(1000)*/


    /**
     * runBlocking函数同样会创建一个协程的作用域，
     * 但是它可以保证在协程作用域内的所有代码和子协程没有全部执行完之前一直阻塞当前线程。
     */
    /* runBlocking {
     println("在协程范围内运行的代码")
     delay(1500)
     println("在协程范围内运行的代码，运行结束")
     }*/

    /**
     * 开启多个协程
     */
    /*runBlocking {
        // 子协程 1
        launch {
            println("子协程 1")
            delay(1000)
            println("子协程 1，结束")
        }
        // 子协程 2
        launch {
            println("子协程 2")
            delay(1000)
            println("子协程 2，结束")
        }
    }*/


//    val start = System.currentTimeMillis()
//    runBlocking {
//        repeat(100000) {
//            launch {
//                println(".")
//            }
//        }
//    }
//    val end = System.currentTimeMillis()
//    println("${end - start} ms")


    runBlocking {
        coroutineScope {
            launch {
                for (i in 1..10) {
                    println(i)
                    delay(1000)
                }
            }
        }
        println("coroutineScope finished")
    }
    println("runBlocking finished")

}

/*
suspend fun doSomething() = coroutineScope {
    println("doSomething...")
    delay(1000)
}*/
