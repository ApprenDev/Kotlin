/*
  If, on the contrary, we need to customize the values of the list, that is, use methods to add,
   delete or change values, we can use mutable lists and in this way we have an extra range of options
   to be able to customize or change the list whenever we want ; for this we must add "mutable"
    in front of "ListOf" for example, to create a mutable list we have
 */

fun main(args: Array<String>) {

    val myMutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    myMutableList[5] = 50

    myMutableList.forEach { item ->
        println(item)
    }

}