package classes

class FancyInfoProvider : BasicInfoProvider(){

    override val providerInfo: String
        get() = "classes.FancyInfoProvider"

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override fun printInfo(person: Person) {
        //super.printInfo(person)
        println("Fancy Info")
    }

    override fun getSessionId(): String {
        return super.getSessionId()
    }

}