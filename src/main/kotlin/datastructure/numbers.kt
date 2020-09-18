package datastructure

/**
 * @author Bilal El Uneis
 * @since Sept 2020
 * bilaleluneis@gmail.com
 */

interface NumberType<T> {
    val value: T
    operator fun plus(another: NumberType<T>) : NumberType<T> // overload + operator
}



