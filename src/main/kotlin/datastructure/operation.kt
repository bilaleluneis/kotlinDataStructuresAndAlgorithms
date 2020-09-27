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


