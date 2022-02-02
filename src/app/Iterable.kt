package app

fun <T> displayIterable(iterable:Iterable<T>){
//    for (value in iterable){
//        println(value)
//    }
    val iterator= iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayIterable(listOf("Supriyanto","Dimas Akhmad", "Alika", "Silda"))
    displayIterable(setOf("Supriyanto","Dimas Akhmad", "Alika", "Silda"))
  //  displayIterable(mapOf("Supriyanto","Dimas Akhmad", "Alika", "Silda"))

}