package app

fun main() {
    val mutableList:MutableList<String> = mutableListOf()

    mutableList.add("supri")
    mutableList.add("dimas")
    mutableList.add("alika")
    mutableList.remove("dimas")
   // println(mutableList[1])

    for (value in mutableList){
        println(value)
    }
}