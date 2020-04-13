package classes

class Person (val firstName : String = "Peter", val lastName:String = "Parker") {// this is a simplified form of
    /*
    * class Person(_firstName: String, _lastName: String){
    * val firstName: String = _firstName
    * val lastName: String = _lastName
    * }
    * */

    //a secondary constructor isn't very necessary since we can use default parameters
    /*init {
        println("Init 1")
    }


    constructor():this("Peter","Parker"){
        println("Secondary contructor")
    }

    init {
        println("Init 2")
    }
*/

    var nickName: String? = null
        set(value) { //helps to define a function behaviour for when set is called and  generates a backing field for this property
            field = value //to assign a new value to our property and without this,the value of nickName would never be updated

            println("The new nickName is $value")
        }

        get() {
            println("The value returned is $field")

            return field
        }


    fun printInfo(){

        val nickNameToPrint: String = nickName ?: "no Nickname" //elvis expression
        println("$firstName ($nickNameToPrint) $lastName")
    }
}