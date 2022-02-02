package app

class Member(val name:String, val hobies:List<String>)
fun main() {
    val list:List<List<String>> = listOf(
        listOf("Supri", "Yanto", "Dimas") ,
        listOf("Supri", "Yanto", "Dimas"),
        listOf("Supri", "Yanto", "Dimas"),
        listOf("Supri", "Yanto", "Dimas"),
    )

    val listString :List<String> = list.flatten()

    println(listString)

    val members :List<Member> = listOf(
        Member("Eko", listOf("Readoing" , "Coding")),
        Member("ERiyan", listOf("Readoing" , "Traveling"))
    )

    val hobies =    members.flatMap { it.hobies }
    println(hobies)
}