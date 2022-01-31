package app

import data.Person

fun main() {
    val mutableSet:MutableSet<Person> = mutableSetOf()

    mutableSet.add(Person("Supri"))
    mutableSet.add(Person("Dimas"))
    mutableSet.add(Person("Dimas"))
    mutableSet.add(Person("Silda"))
    println(mutableSet.size)

    for (person in mutableSet){
        println(person)
    }
}