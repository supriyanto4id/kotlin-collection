package app

fun main() {
    val set = setOf("Supri","yanto","dimas")

    println(set.elementAt(0))
    println(set.first())
    println(set.last())
    println(set.elementAtOrNull(2))
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(10){"tidak ada data"})
}