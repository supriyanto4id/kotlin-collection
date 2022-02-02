package app

fun <T> displayCollection(collection:Collection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
  val displayList=  displayCollection(listOf(1,"Supri"))
    displayCollection(listOf(1,"Supri"))
    displayCollection(mutableListOf(1,"Supri"))
    displayCollection(setOf(1,"Supri"))
    displayCollection(mutableSetOf(1,"Supri"))
    displayCollection(mapOf(1 to "Supri").entries)
    displayCollection(mutableMapOf(1 to "Supri").entries)


}