package app

fun <T> displayMutableCollection(collection:MutableCollection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
    //val displayList=  displayMutableCollection(listOf(1,"Supri"))
    //displayMutableCollection(listOf(1,"Supri"))
    displayMutableCollection(mutableListOf(1,"Supri"))
   // displayMutableCollection(setOf(1,"Supri"))
    displayMutableCollection(mutableSetOf(1,"Supri"))
    //displayMutableCollection(mapOf(1 to "Supri").entries)
    displayMutableCollection(mutableMapOf(1 to "Supri").entries)
}

