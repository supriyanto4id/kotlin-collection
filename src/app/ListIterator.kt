package app

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while (listIterator.hasNext()){
        println(listIterator.next())
    }

    println("Display Previos")
    while (listIterator.hasPrevious()){
        println(listIterator.previous())
    }
}

fun main() {
    displayListIterator(listOf("Dimas", "Akhmad", "Prasetiyo").listIterator())
}
