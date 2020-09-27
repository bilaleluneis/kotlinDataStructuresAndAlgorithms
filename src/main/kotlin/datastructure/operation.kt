package datastructure

import java.lang.Exception

/**
 * @author Bilal El Uneis and Jieshu Wang
 * @since Sept 2020
 * bilaleluneis@gmail.com, foundwonder@gmail.com
 */

interface MathOperation<T> {
    val name: String
    operator fun invoke(vararg params: T): T
}

class BinaryOperation<T>(private val opName: String, private val op: (T, T) -> T) : MathOperation<T> {
    override val name: String
        get() = opName

    override fun invoke(vararg params: T): T = when (params.size) {
        2 -> op(params[0], params[1])
        else -> throw Exception("Binary operation takes exactly two parameters.")
    }
}

class UnaryOperation<T>(private val opName: String, private val op: (T) -> T) : MathOperation<T> {
    override val name: String
        get() = opName

    override fun invoke(vararg params: T): T = when (params.size) {
        1 -> op(params[0])
        else -> throw Exception("Unary operation takes exactly one parameter.")
    }
}



