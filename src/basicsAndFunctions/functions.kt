package basicsAndFunctions

fun getGreeting(): String {
    return "Hello Kotlin \n"
} //fun basicsAndFunctions.getGreeting(): String = "Hello Kotlin"  this is a single expression function.
// Type inference is when you dont specify the type of function or variable eg fun basicsAndFunctions.getGreeting() = "Hello kotlin"

fun sayKotlin(): Unit{
  println(getGreeting())

}
fun sayDsc(itemtoGreet : String){
    val message = "Hello " + itemtoGreet + "\n"
    println(message)
}

fun sayHello(greeting:String, itemsToGreet: List<String>) {
    itemsToGreet.forEach {itemToGreet ->
     println("$greeting $itemToGreet")
    }
}//Unit is like void return type and can be omitted

fun sayHi(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach { itemToGreet->
        println("$greeting $itemToGreet")
    } //vararg eliminates the need to always pass a value after the initial basicsAndFunctions.basicsAndFunctions.getGreeting argument and also accepts any number of arguments
}

fun main() {
    println("Hello world")
    println(getGreeting())
    println(sayKotlin())

    sayDsc("Dsc Rongo")

    val interestingThings = listOf("Kotlin","comic books","programming" + "\n")
    sayHello("Hello", interestingThings)

    val interestingNames = arrayOf("Mary","Hannah","Jane")
    sayHi(
        "Hi",
        *interestingNames
    ) //spread operator (applying * before the array variable a a parameter) helps us to pass an array to a vararg param


}