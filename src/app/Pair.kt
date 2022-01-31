package app

fun main() {
    val pair:Pair<String,String> = Pair("Supri","Dimas")
    println(pair.first)
    println(pair.second)

    val pair2:Pair<String,Int> ="Supri" to 1

    println("${pair2.first} and  ${pair2.second}")
}