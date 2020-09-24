package datastructure

/**
 * @author Bilal El Uneis and Jieshu Wang
 * @since Sept 2020
 * bilaleluneis@gmail.com, foundwonder@gmail.com
 */

interface NumberType<T> {
    val value: T
    operator fun plus(another: NumberType<T>) : NumberType<T> // overload + operator
}


class IntegerType(private val integerValue: Int): NumberType<Int> {
    override val value: Int get() = integerValue
    override fun plus(another: NumberType<Int>) = IntegerType(this.value + another.value)
}

class FloatType(private val floatValue: Float): NumberType<Float> {
    override val value: Float get() = floatValue
    override fun plus(another: NumberType<Float>) =  FloatType(this.value + another.value)
}

