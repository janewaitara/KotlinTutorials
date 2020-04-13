package basicsAndFunctions

fun main() {
    //array
    val interestingThings = arrayOf("Kotlin","Comic Books","Programming")
    println(interestingThings.size)
    println(interestingThings[1])
    println(interestingThings.get(0)+"\n")

    for (interestingThing in interestingThings){
        println(interestingThing +"\n")
    }

    //to iterate using foreach but we loose index data
    interestingThings.forEach { interestingThing ->  //renaming using an arrow for readability
        println(interestingThing + "\n")
    }

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
}