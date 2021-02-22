/*
Arrays or arrays and lists are a fundamental element in any programming language
 that allow us to handle collections of values or data of the same type, whether among Kotlin primitives.
 */

fun main(args: Array<String>) {

    val simpleArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("List of size : ${simpleArray.size}")

    println("The values are: ")
    simpleArray.forEach { item ->
        println(item)
    }

}