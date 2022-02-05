package app

fun main() {
    val list1 = listOf("a","b", "a","b" ,"c","c","d","a","b" ,"c","c", "d")

    val map :Map<String, List<String>> = list1.groupBy { value -> value }
    println(map)

    val grouping :Grouping<String,String> = list1.groupingBy { it }
    println(grouping)

    val group :Grouping<String,String> =list1.groupingBy { it }

    println(grouping.eachCount())

    println(grouping.fold("") {first, second -> first +second})
    
    val aggate =grouping.aggregate{ key, first: String?, second, isfirst ->
     if (isfirst) second
        else first + second
    }

    println(aggate)
}