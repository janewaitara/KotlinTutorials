package basicsAndFunctions

fun main() {
    val interestingThings = mutableListOf("Kotlin","comic books","programming")
    interestingThings.add("Golang")



    interestingThings.forEach{interestingThing ->
        println(interestingThing)
    }

    println(interestingThings.get(1) + "\n")

}