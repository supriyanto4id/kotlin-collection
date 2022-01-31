package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Supro"),
        Person("Kurniawawan"),
        Person("Dimas"),
        Person("Dimas"))


    println(set.size)
    println(set.contains(Person("Dimas")))

    for (person in set){
        println(person)
}
}