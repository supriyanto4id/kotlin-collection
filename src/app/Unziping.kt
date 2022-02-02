package app

fun main() {
    val list: List<Pair<String, String>> = listOf(
        "Supri" to "yanto",
        "dimas" to "akhmad",
        "silda" to  "melani",
        "alika" to "oktatianti"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.second)
    println(pair.first)

    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)

}