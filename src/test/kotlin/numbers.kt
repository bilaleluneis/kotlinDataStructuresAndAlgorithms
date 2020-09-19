import org.junit.Test
import kotlin.test.assertEquals
import datastructure.IntegerType
import datastructure.NumberType
import datastructure.FloatType


/**
 * @author Bilal El Uneis and Jieshu Wang
 * @since Sept 2020
 * bilaleluneis@gmail.com, foundwonder@gmail.com
 */


class NumbersTests {

    @Test
    fun initInteger() {
        val aInteger: NumberType<Int> = IntegerType(3)
        assertEquals(aInteger.value, 3)
    }

    @Test
    fun plusInteger() {
        val aInteger: NumberType<Int> = IntegerType(3)
        val anotherInteger: NumberType<Int> = IntegerType(4)
        val sumInteger: NumberType<Int> = aInteger + anotherInteger
        assertEquals(sumInteger.value, 7)
    }

    @Test
    fun initFloat() {
        val aFloat: NumberType<Float> = FloatType(3.0f)
        assertEquals(aFloat.value, 3.0f)
    }

    @Test
    fun plusFloat() {
        val aFloat: NumberType<Float> = FloatType(3.0f)
        val anotherFloat: NumberType<Float> = FloatType(4.0f)
        val sumFloat: NumberType<Float> = aFloat + anotherFloat
        assertEquals(sumFloat.value, 7.0f)
    }

}