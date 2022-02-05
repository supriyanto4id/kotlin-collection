package app

fun main() {
    val list1 = listOf("Supri", "yanto", "dimas")
    val list2 =list1 + "Alika"
    println(list2)

    val list3 = list1 + list2
    println(list3)

    val list4 = list1 + listOf("Bisa", "jadi", "Android Developer")
    val list5 = list4.joinToString ( " ","","" )
    println(list4)
    println(list5)
}