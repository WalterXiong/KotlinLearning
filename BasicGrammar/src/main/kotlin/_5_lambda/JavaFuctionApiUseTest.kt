package _5_lambda

class JavaFuctionApiUseTest {


}

fun main() {

    Thread(object : Runnable {
        override fun run() {
            println("开启一个线程")
        }
    }).start()

    Thread(Runnable {
        println("开启一个线程")
    }).start()

    Thread({
        println("开启一个线程")
    }).start()

    Thread() {
        println("开启一个线程")
    }.start()

    Thread {
        println("开启一个线程")
    }.start()
}