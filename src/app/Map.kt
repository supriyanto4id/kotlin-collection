package app

fun main() {
    val map:Map<String,String> =  mapOf(
        Pair("a","Supri"),
        "b" to "Yanto",
        "t" to "Dimas"
    )

    for ((ket,value) in map){
        println("$ket to $value")
    }
}