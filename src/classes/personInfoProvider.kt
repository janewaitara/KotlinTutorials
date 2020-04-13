package classes

interface PersonInfoProvider {

    val providerInfo: String

    fun printInfo(person: Person){
        println("$providerInfo")
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId():String
}


open class BasicInfoProvider : PersonInfoProvider,
    SessionInfoProvider {
    protected open val sessionIdPrefix = "Session"



    override val providerInfo: String
        get() = "classes.BasicInfoProvider"


    override fun printInfo(person: Person) {
        super.printInfo(person)

        println("additional print statement")

    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {
    //val provider = BasicInfoProvider()
   // val provider = FancyInfoProvider()

    val provider = object : PersonInfoProvider{ //anonymous  class using object expression
        override val providerInfo: String
            get() = "New info Provider in anonymous class"

        fun getSessionId() = "id"

    }
    provider.printInfo(Person())
    println(provider.getSessionId())


    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){

    if (infoProvider is SessionInfoProvider){//type checking

        println("is Session Info Provider")
    //(infoProvider as classes.SessionInfoProvider).getSessionId() //type casting
        infoProvider.getSessionId() //Smart cast

    } else {
        println("is not session Info Provider")
    }
}