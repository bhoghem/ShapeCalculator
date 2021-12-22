package Shape

class Rectangle(
    private val length: Double,
    private val width: Double
) : Shape("Rectangle") {
    override fun calculateArea(): Double {
        return length * width
    }

    override fun calculateCirculare(): Double {
        return 2 * (length + width)
    }
}