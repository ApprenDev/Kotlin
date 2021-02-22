/*
   It is a flow control statement that the code executes repeatedly based on a Boolean condition.
   The while loop can be thought of as a repeating if statement.
   */

fun main(args: Array<String>) {

    var number = 1

    while (number <= 10) {
        println("Line $number")
        ++number
    }

}