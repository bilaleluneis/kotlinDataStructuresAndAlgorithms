import org.junit.Test
import datastructure.MathOperation
import datastructure.BinaryOperation
import datastructure.UnaryOperation
import java.lang.Exception
import kotlin.math.pow
import kotlin.test.assertEquals
import kotlin.test.assertTrue


/**
 * @author Bilal El Uneis and Jieshu Wang
 * @since Sept 2020
 * bilaleluneis@gmail.com, foundwonder@gmail.com
 */

class OperationTests {

    @Test
    fun addTwoInts() {
        val intAdder: MathOperation<Int> = BinaryOperation("Integer Adder") { a_int, b_int -> a_int + b_int }
        val result: Int = intAdder(1, 2)
        assertTrue { result == 3 }
    }

    @Test(expected = Exception::class)
    fun addParamMismatch() {
        val intAdder: MathOperation<Int> = BinaryOperation("Integer Adder") { a_int, b_int -> a_int + b_int }
        intAdder(1, 2, 3)
    }

    @Test
    fun squareInt() {
        val intSquarer: MathOperation<Int> = UnaryOperation("Integer Square") { a_int ->
            a_int.toDouble().pow(2).toInt()
        }
        val result: Int = intSquarer(2)
        assertEquals(result, 4)
    }

    @Test(expected = Exception::class)
    fun squareParamMismatch() {
        val intSquarer: MathOperation<Int> = UnaryOperation("Integer Square") { a_int -> a_int.toDouble().pow(2).toInt() }
        intSquarer(1, 2)
    }

}