package Shape

abstract class Shape (private val shapeName : String) {

    fun printShapeName(){
        println("This is a $shapeName")
    }
    fun printTotalAreaAndCirculare(){
        println(" This is Total Area= ${calculateArea()}")
        println(" This is Circulate Area= ${calculateCirculare()}")
    }
    abstract fun calculateArea() : Double
    abstract fun calculateCirculare(): Double
}