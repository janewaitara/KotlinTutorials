package classes

fun main() {
    //instance of class person
    val person  = Person()
    person.firstName
    person.lastName //property access syntax

    person.nickName = "Nick"
    person.nickName = "Lydiah \n"
    println(person.nickName)

    //person.printInfo()

}