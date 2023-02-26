fun helloWorld() {
  println("Hello World")
}

fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

fun double(a: Int): Int = a * 2

fun hitungTotal(vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total;
}

fun main() {
    val result = hitungTotal(10, 10 ,10 ,10, 10)

    println(result)
}
