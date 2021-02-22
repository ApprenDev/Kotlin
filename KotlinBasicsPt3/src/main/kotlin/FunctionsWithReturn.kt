/*
   When closing the parenthesis we will put the type of variable that our function should return.
    Then the function will do what it has to do and when it has the result.
 */

fun main (args : Array<String>) {
    println("The result is ${getSumValues(20, 50)}")
}

fun getSumValues(a : Int, b : Int): Int {
    return a + b
}