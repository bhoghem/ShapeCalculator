package Shape

class Circle (
    private val phi: Double,
    private val r: Double
        ) : Shape("Circle"){

    override fun calculateArea(): Double {
        return phi * r * r
    }

    override fun calculateCirculare(): Double {
        return 2 * r * phi
    }
}