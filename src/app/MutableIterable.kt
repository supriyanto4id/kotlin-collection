package app

fun <T> displayMutableIterable(iterable:MutableIterable<T>){
//    for (value in iterable){
//        println(value)
//    }
    val iterator= iterable.iterator()
    while (iterator.hasNext()){
//        iterator.remove()
        val value = iterator.next()

        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableSetOf("Supriyanto","Dimas Akhmad", "Alika", "Silda"))
    displayMutableIterable(mutableListOf("Supriyanto","Dimas Akhmad", "Alika", "Silda"))
    //  displayIterable(mapOf("Supriyanto","Dimas Akhmad", "Alika", "Silda"))

}