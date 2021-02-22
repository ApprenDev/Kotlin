/*
     The lists in Kotlin are immutable, which in other words means,
     that they cannot mutate or what is the same that they cannot change.
   */

fun main(args: Array<String>) {

    val simpleList = listOf("A", "B", "C", "D", "E")
    simpleList.forEach { item -> println(item) }

}