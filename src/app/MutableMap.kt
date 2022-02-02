package app

fun main() {
    val mutableMap:MutableMap<Int, String> = mutableMapOf()

    mutableMap.put(1,"Mildy")
    mutableMap.put(2,"Mildy")
    mutableMap[3]="Dimas"

    println(mutableMap[3])
    println(mutableMap[1])
    println(mutableMap.get(2))
    println(mutableMap.getOrDefault(4,"tidak ada data nya"))

    mutableMap.remove(2)

    for ((key, value) in mutableMap){
        println("$key value is $value ")
    }
}