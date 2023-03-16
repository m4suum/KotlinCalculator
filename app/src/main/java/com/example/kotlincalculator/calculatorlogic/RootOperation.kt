package com.example.kotlincalculator.calculatorlogic

import kotlin.math.sqrt

object RootOperation {
    fun root(number: Float): Float {
        return sqrt(number.toDouble()).toFloat()
    }
}