package app

fun main() {
    val list1 = listOf("Supri", "Yanto0", "Dimas")
    val list2 = list1.filter { it.length > 5 }
    println(list2)

    val list4 = listOf(null, 1, "supri", "kurniawan", null, 2 ,3 )

    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listInt = list4.filterIsInstance<Int>()
    println(listInt)
    val listNotNull = list4.filterNotNull()
    println(listNotNull)

}