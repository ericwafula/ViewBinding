package tech.ericwathome.kotlinmodule

fun main() {
    val myVal = add(1, 2)
    print(myVal)
}

fun add(a: Int, b: Int): Int {
    return a + b
}