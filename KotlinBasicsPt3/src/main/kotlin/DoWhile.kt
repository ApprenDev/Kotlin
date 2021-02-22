/*
     The do while loop is similar to the while loop with the only difference
     that it checks the condition after executing the statements.
   */

fun main(args: Array<String>) {

    var sum = 0
    var input: String

    do {
        print("Enter a integer: ")
        input = readLine().toString()
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")

}