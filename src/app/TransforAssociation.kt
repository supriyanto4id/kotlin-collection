package app

fun main() {
    val nameList :List<String> = listOf("Supri", "Dimas", "Ahmad" )
    val map: Map<String,Int> = nameList.associate { Pair(it, it.length) }
    println(map)

    val map2: Map<Int,String> = nameList.associateBy {
        it.length
    }
    println(map2)
}