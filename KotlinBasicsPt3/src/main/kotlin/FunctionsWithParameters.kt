/*
  The way to declare them is very easy: the name of the variable, followed by
   a colon and the type of variable, here it is mandatory to define the type.
 */

fun main(args: Array<String>) {
    showSimpleMessage("Johnson Michael")
}

fun showSimpleMessage(name: String) {
    println("Welcome $name")
}