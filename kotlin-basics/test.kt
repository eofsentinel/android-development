fun main() {
    val readOnlyVariable = 10
    var actualVariable = 100
    actualVariable = 200
    println ("Readonly variable : ${readOnlyVariable}")
    println ("Actual variable: $actualVariable")
}