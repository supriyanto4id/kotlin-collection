package app

fun main() {

    val data = listOf("Supri", "Dimas","yanto").forEach{
        println(it)
    }

//    for (value in listOf("dimas", "silda") ){
//        println(value)
//    }

    mutableListOf("Riyan", "Mildy", "Dimas").forEachIndexed { index, value ->
        println("$index : $value")
    }
}