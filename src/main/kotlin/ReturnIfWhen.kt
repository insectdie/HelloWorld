fun sayHello(name: String = ""): String {
    return if (name == "") {
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

fun main() {
    print(sayHello());
}