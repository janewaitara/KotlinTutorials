package basicsAndFunctions
//allows us to specify which parameter this argument value is going to be used for
//we can have default parameter values for our functions hence when called, one can pass just parameter or fail to pass a parameter
fun greetPerson(greetings:String, name:String) = println("$greetings $name")
fun greetPeople(greeting:String = "Hello", names:String = "Jane") = println("$greeting $names")

fun main() {
    greetPerson(greetings = "Hi", name = "Nate") //we can pass the parameters whether is order or not
    greetPeople(names = "Mumbi")
}