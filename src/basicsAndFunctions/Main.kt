package basicsAndFunctions
//top level variable


var greeting: String? = null//mutable variables
val name: String = "Nate"  //read only and defined only once

fun main() {
//CONTROL FLOW IN KOTLIN
   greeting = "Hello \n\n"

  /*  if(basicsAndFunctions.basicsAndFunctions.getGreeting!=null){
        println(basicsAndFunctions.basicsAndFunctions.getGreeting)
    }else{
        println("Hi")
    }*/

    //a when statement is like a switch statement in java

    when(greeting){

        null -> print("Hi ")
        else -> println(greeting)
    }

    println(name)

    //USED TO ASSIGN VARIABLES
    val greetingToSay : String = if(greeting != null ) greeting!! else "Hi"
    println(greetingToSay)


    greeting = null
    var greetingToPrint: String = when(greeting){

        null -> "Hi"
        else -> greeting!!

    }
    print(greetingToPrint)


}
