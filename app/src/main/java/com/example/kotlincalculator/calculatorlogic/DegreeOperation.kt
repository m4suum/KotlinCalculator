package com.example.kotlincalculator.calculatorlogic

import kotlin.math.pow

object DegreeOperation {
    fun degree(firstNumber: Float, secondNumber: Float): Float {
        return firstNumber.toDouble().pow(secondNumber.toDouble()).toFloat()
    }
}