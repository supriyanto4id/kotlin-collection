package app

import java.lang.StringBuilder

fun main() {
    val list:List<String> = listOf("Supri", "Yanto", "Dimas")

    val completeName :String = list.joinToString (" ")
    println(completeName)

    val string2:String =list.joinToString ( " ", "*" , "*" ){ it.toUpperCase()}

    println(string2)

    val builder = StringBuilder()
    list.joinTo(builder," ","?","?")

    val string3 =builder.toString()

    println(string3)

}