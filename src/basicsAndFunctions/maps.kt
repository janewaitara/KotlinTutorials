package basicsAndFunctions

fun main() {

    val map = mutableMapOf(1 to "a",2 to "b", 3 to "c")//takes pairs as params , ie key amd value
    map.put(4,"d")
    //in mutable collections items can  be added
    map.forEach { key, value ->
        println("$key -> $value") }

}