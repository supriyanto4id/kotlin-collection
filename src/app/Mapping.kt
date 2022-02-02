package app

fun main() {
    val list: List<String> = listOf("Supri", "Dimas", "Prasetiyo", "alika", "mildi", "Silda")

    val temp = mutableListOf<String>()
        for (value in list){
            temp.add(value.toUpperCase())
        }
    println(temp)

    val list2 =list.map { it.toLowerCase() }
    println(list2)

    val nameGanjil = list.mapIndexedNotNull{index, name ->
        if (index% 2 == 0) null
        else name.toLowerCase()
    }
    println(nameGanjil)

    val number =(1..100).toList()
    val ganjil =number.mapNotNull {
        if (it%2==0)null
        else it
    }
    println(ganjil)
}