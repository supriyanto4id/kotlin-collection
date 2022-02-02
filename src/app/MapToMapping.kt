package app

fun main() {
    val map:Map<Int,String> = mapOf(
        1 to "Supri",
        2 to  "Yantp",
        3 to  "dimas",
        4 to  "riyant"
    )

    val mapKey =map.mapKeys { it.key * 2 }
    println(mapKey)

    val mapValue = map.mapValues { it.value.toUpperCase() }
    println(mapValue)
}