package app

fun main() {
    val chars= ('a'..'z').toList()

    val listChar = chars.take(3)
    println(listChar)
    println(chars.takeLast(5))

    println(chars.takeWhile { it < 'f' })
    println(chars.takeLastWhile { it > 'g' })

    println(chars.drop(10))
    println(chars.dropLast(10))
    println(chars.dropWhile { it < 'x' })
    println(chars.dropLastWhile { it > 'b' })
}