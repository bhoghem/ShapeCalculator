package Shape

class Triangle (
    private val length: Double,
    private val width: Double
        ): Shape("Triangle"){

    override fun calculateArea(): Double {
        return 0.5 * length * width
    }

    override fun calculateCirculare(): Double {
        return 3 * width
    }
}