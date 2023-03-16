package com.example.kotlincalculator.calculatorlogic

object SineOperation {
    fun sin(number: Float): Float {
        return kotlin.math.sin(Math.toRadians(number.toDouble())).toFloat()
    }
}