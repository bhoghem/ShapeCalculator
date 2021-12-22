import Shape.Circle
import Shape.Rectangle
import Shape.Triangle

class App {
    fun run(){
        printHeader()
        inputMenu()
    }

    private fun inputMenu() {
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                openMenuRectangle()
            }

            "2" -> {
                openMenuCircle()
            }
            "3" -> {
                openMenuTriangle()
            }


            else -> {
                println("No menu match")
                run()
            }
        }
    }

    private fun openMenuTriangle() {
        println("Enter Length= ")
        val length = getValueLine()
        println("Enter Width= ")
        val width = getValueLine()
        val triangle = Circle(length, width)
        triangle.printShapeName()
        triangle.printTotalAreaAndCirculare()
    }

    private fun getValueLine(): Double {
        return try {
            readLine()?.toDouble() ?: 0.0
        } catch (e:NumberFormatException){
            0.0
        }




    }

    private fun openMenuCircle() {
        println("Enter R= ")
        val r = getValue()
        println("Enter Width= ")
        val phi = 3.14
        val rectangle = Circle(r, phi)
        rectangle.printShapeName()
        rectangle.printTotalAreaAndCirculare()
    }

    private fun getValue(): Double {
        return try {
            readLine()?.toDouble() ?: 0.0
        } catch (e:NumberFormatException){
            0.0
        }


    }

    private fun openMenuRectangle() {
        println("Enter Length= ")
        val length = getValueFromUser()
        println("Enter Width= ")
        val width = getValueFromUser()
        val rectangle = Rectangle(length, width)
        rectangle.printShapeName()
        rectangle.printTotalAreaAndCirculare()
    }

    private fun getValueFromUser(): Double {
        return try {
            readLine()?.toDouble() ?: 0.0
        } catch (e:NumberFormatException){
            0.0
        }

    }

    private fun printHeader() {
        println("""
            ======================================
            Console App for Calculating Area in 2D
            ======================================
            1.Calculate Rectangle Area
            2.Calculate Circle Area
            3.Calculate Triangle Area
            4.Print Star
            ======================================
            Enter Menu ? (1,2,3,4)
            ======================================
        """.trimIndent())
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}